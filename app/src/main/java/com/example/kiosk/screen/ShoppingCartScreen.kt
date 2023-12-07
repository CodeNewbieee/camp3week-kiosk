package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class ShoppingCartScreen {

    var isShoppingCartEmpty = true
    val deleteFromShoppingCart = DeleteFromShoppingCart()
    fun run(){
        var input = ""
        while(true) {
            isShoppingCartEmpty = MyKiosk.shoppingCart.isEmpty()
            input = getInput()
            if(input == "b") return
            else if(input == "d") deleteFromShoppingCart.run()
        }
    }
    private fun getInput():String{
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
    private fun printScreen(){
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
        println("-----가격 총 합: ${costSum}")
    }

    class DeleteFromShoppingCart() {
        fun run() {
            val input = getInput()
            MyKiosk.shoppingCart.removeMenuItemAt(input.toInt() - 1)
            println("선택한 항목이 삭제되었습니다.")
        }

        private fun getInput(): String {
            var possibleInputs = arrayOf<String>()
            for (i in 1..MyKiosk.shoppingCart.getSize()) possibleInputs += i.toString()

            var input = ""
            while (true) {
                printScreen()
                input = readLine()?.toString() ?: ""
                if (possibleInputs.contains(input)) break
                else println("잘못된 입력입니다.")
            }
            return input
        }

        private fun printScreen() {
            println("[장바구니에서 항목 삭제하기]")
            println("삭제할 항목의 번호를 입력하세요.")
            print("->")
        }
    }
}