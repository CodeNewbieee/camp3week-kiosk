package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class OrderPaymentScreen : Screen() {
    var costSum = 0
    var balance = 0

    val bankTime1 = "23:10:00" //은행 점검 시작 시간
    val bankTime2 = "23:20:00" //은행 점검 종료 시간

    override fun run(): String {
        //은행 점검시간 확인
        val dateTimeManager = MyKiosk.dateTimeManager
        var currentTime = dateTimeManager.getTimeString()
        if(dateTimeManager.timeCompare(bankTime1, currentTime) && dateTimeManager.timeCompare(currentTime, bankTime2)){
            printPaymentFailScreen(currentTime)
            return "false"
        }

        //결제 가능한 경우
        costSum = MyKiosk.shoppingCart.getCostSum()
        balance = MyKiosk.paymentManager.getBalance()

        printScreen()
        while(balance < costSum) {
            val money = getInput()
            balance = MyKiosk.paymentManager.deposit(money.toInt())
            MyKiosk.taskDelayManager.delayTask3seconds("입금")
            println("현재 잔고는 ${balance}원 입니다.")
        }
        if(MyKiosk.paymentManager.withDraw(costSum)){
            MyKiosk.taskDelayManager.delayTask3seconds("출금")
            return "true"
        }
        return "false"
    }

    private fun printPaymentFailScreen(currentTime:String) {
        println("[주문 결제 화면]")
        println("현재 시각은 ${currentTime} 입니다.")
        println("은행 점검 시간(${bankTime1}~${bankTime2})에는 결제할 수 없습니다.")
        println("잠시 후 메인 화면으로 돌아갑니다...")
    }

    override fun getInput(): String {
        var input = ""
        while(true){
            println("추가로 입금할 금액을 입력해주세요.(단위: 원)")
            print("->")
            input = readLine()?.toString() ?: ""
            try{
                //입력된 값을 Int로 바꿀 수 있다면, 입력 성공적으로 끝내기
                input.toInt()
                break
            }catch(e:Exception){
                println("잘못된 입력입니다.")
            }
        }
        return input

    }

    override fun printScreen() {
        println("[주문 결제 화면]")
        println("주문하기 위해 필요한 금액은 ${costSum}원 입니다.")
        println("현재 잔고는 ${balance}원 입니다.")
    }
}