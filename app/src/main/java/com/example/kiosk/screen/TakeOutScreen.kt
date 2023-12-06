package com.example.kiosk.screen

class TakeOutScreen {

    fun run():String{
        return getInput()
    }

    private fun getInput():String{
        val possibleInputs = listOf("1", "2", "q")
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
        println("[먹고 가기/포장하기 화면]")
        println("1. 먹고 가기")
        println("2. 포장하기")
        println("")
        println("q. 주문 종료 - 주문을 종료하고 첫 화면으로 돌아갑니다.")
    }
}