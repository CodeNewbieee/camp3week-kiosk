package com.example.kiosk.screen

class FirstScreen:Screen(){
    override fun run(): String {
        return getInput()
    }

    override fun getInput():String{
        printScreen()
        return readLine() ?: ""
    }
   override fun printScreen(){
        println("[첫 화면]")
        println("주문을 시작하려면 아무 키나 입력하세요...")
        print("->")
    }
}