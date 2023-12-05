package com.example.kiosk

class Burger(name: String, price: Int, description: String) : Menu(name, price, description) {
    override fun displayInfo() {
        println("상품명: $name 가격: ${price}원 설명 : $description")
    }

}

