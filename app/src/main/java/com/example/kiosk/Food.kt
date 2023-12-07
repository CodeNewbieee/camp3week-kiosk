package com.example.kiosk

import java.util.Timer
import kotlin.concurrent.schedule

class Food(num: Int,name:String, price:Int, info: String) : MainMenu() {
    var num = num
    var name = name
    var price = price
    var info = info
    override fun displayInfo() {
        println("${num}번 : ${name}, 가격 : ${price}원, 설명: ${info}")
    }
}