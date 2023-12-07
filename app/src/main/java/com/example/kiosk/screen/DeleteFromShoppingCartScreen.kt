package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class DeleteFromShoppingCart() : Screen() {
    override fun run(): String {
        val input = getInput()
        MyKiosk.shoppingCart.removeMenuItemAt(input.toInt() - 1)
        println("선택한 항목이 삭제되었습니다.")
        return ""
    }

    override fun getInput(): String {
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

    override fun printScreen() {
        println("[장바구니에서 항목 삭제하기]")
        println("삭제할 항목의 번호를 입력하세요.")
        print("->")
    }
}