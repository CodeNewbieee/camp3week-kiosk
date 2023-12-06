package com.example.kiosk.screen

import com.example.kiosk.MyKiosk
import com.example.kiosk.menu.MyMenu

class MainScreen() {
    fun run():String{
        return getInput()
    }

    private fun getInput():String{
        var possibleInputs = arrayOf("c", "o", "b", "q")
        for (i in 1..MyKiosk.myMenu.myMenuCollections.size)
            possibleInputs += i.toString()

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
        println("[메인 화면]")
        MyKiosk.myMenu.printMyMenuCollections()
        println()
        println("c: 장바구니 - 장바구니 화면으로 이동합니다.")
        println("o: 주문하기 - 주문하기 화면으로 이동합니다.")
        println("b: 뒤로 가기 - 먹고 가기/포장하기 화면으로 돌아갑니다.")
        println("q: 주문 종료 - 주문을 종료하고 첫 화면으로 돌아갑니다.")
    }
}