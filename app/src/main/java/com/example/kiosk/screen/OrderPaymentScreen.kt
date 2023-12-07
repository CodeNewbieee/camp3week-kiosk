package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class OrderPaymentScreen : Screen() {
    var costSum = 0
    var balance = 0

    override fun run(): String {
        costSum = MyKiosk.shoppingCart.getCostSum()
        balance = MyKiosk.paymentManager.getBalance()

        printScreen()
        while(balance < costSum) {
            val money = getInput()
            balance = MyKiosk.paymentManager.deposit(money.toInt())
            println("현재 잔고는 ${balance}원 입니다.")
        }
        println("결제가 진행중입니다...")
        if(MyKiosk.paymentManager.withDraw(costSum)) return "true"
        return "false"
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