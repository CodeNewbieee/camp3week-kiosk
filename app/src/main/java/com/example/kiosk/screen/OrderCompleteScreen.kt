package com.example.kiosk.screen

import com.example.kiosk.MyKiosk

class OrderCompleteScreen : Screen() {
    override fun run():String{
        printScreen()
        return ""
    }

    override fun getInput(): String {
        //not used
        return ""
    }
    override fun printScreen(){
        println("[주문 완료 화면]")
        println("주문이 완료되었습니다.")
        println("잠시 후 첫 화면으로 이동합니다...")
    }
}