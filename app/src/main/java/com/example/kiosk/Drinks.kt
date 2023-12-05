package com.example.kiosk

class Drinks(name: String, price: Int, description: String) : Menu(name, price, description) {
    override fun displayInfo() {
        println("상품명: $name \n가격: ${price}원 \n설명: $description")
    }
}