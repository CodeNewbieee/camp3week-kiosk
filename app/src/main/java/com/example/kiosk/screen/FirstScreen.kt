package com.example.kiosk.screen

//0. 첫 화면
class FirstScreen {
    fun run(){
        getInput()
    }

    //아무 키나 입력 받기
    private fun getInput(){
        printScreen()
        readLine()
    }

    private fun printScreen(){
        println("[첫 화면]")
        println("주문을 시작하려면 아무 키나 입력하세요...")
        print("->")
    }
}