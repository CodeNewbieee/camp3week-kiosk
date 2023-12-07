package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class ShoppingCartScreen: Screen() {

    var isShoppingCartEmpty = true
    val deleteFromShoppingCart = DeleteFromShoppingCart()
    override fun run():String{
        var input = ""
        while(true) {
            isShoppingCartEmpty = MyKiosk.shoppingCart.isEmpty()
            input = getInput()
            if(input == "b") return ""
            else if(input == "d") deleteFromShoppingCart.run()
        }
    }
    override fun getInput():String{
        var possibleInputs = arrayOf("b")
        if(!isShoppingCartEmpty) possibleInputs += "d"

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
        println("[장바구니 화면]")
        if(isShoppingCartEmpty) println("장바구니가 비었습니다.")
        else MyKiosk.shoppingCart.printMenuItems()
        if(!isShoppingCartEmpty) printCostSum()
        println("b: 뒤로 가기 - 메인 화면으로 돌아갑니다.")
        if(!isShoppingCartEmpty) println("d: 장바구니에서 삭제 - 선택한 항목을 장바구니에서 삭제합니다.")
        print("->")
    }

    private fun printCostSum(){
        var costSum = MyKiosk.shoppingCart.getCostSum()
        println("-----가격 총 합: ${costSum}원")
    }
}