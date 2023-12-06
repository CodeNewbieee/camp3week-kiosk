package com.example.kiosk

class Drinks(num:Int, name:String, price :Int) : Food(name, price){
    var num = num
    var name = name
    var price = price
    override fun displayInfo() {
        println("${num}번 ${name}의 가격은 ${price}원 입니다.")
    }

    fun drinkchoose() {
        println("${name}을 선택하셨습니다. 장바구니에 담으시겠습니까?")
    }
}