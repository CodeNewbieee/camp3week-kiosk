package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class OrderScreen : Screen(){
    var isShoppingCartEmpty = true
    override fun run():String{
        isShoppingCartEmpty = MyKiosk.shoppingCart.isEmpty()

        val input = getInput()
        if(input == "b") return "false"
        if(input == "p") return "true"
        return ""
    }

    override fun getInput():String{
        var possibleInputs = arrayOf("b")
        if(!isShoppingCartEmpty) possibleInputs += "p"

        var input = ""
        while(true){
            printScreen()
            input = readLine()?.toString() ?: ""
            if(possibleInputs.contains(input)) break
            else println("잘못된 입력입니다.")
        }
        return input
    }
    override fun printScreen(){
        println("[주문하기 화면]")
        println("-----${if(MyKiosk.isTakeOut)"포장하기" else "먹고 가기"}")
        if(isShoppingCartEmpty) println("장바구니가 비었습니다.")
        else MyKiosk.shoppingCart.printMenuItems()
        if(!isShoppingCartEmpty) printCostSum()
        println("b: 뒤로 가기 - 메인 화면으로 돌아갑니다.")
        if(!isShoppingCartEmpty) println("p: 결제하기 - 주문 완료 화면으로 이동합니다.")
        print("->")
    }

    private fun printCostSum(){
        var costSum = MyKiosk.shoppingCart.getCostSum()
        println("-----가격 총 합: ${costSum}")
    }
}