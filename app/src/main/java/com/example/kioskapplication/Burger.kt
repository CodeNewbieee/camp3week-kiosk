package com.example.kioskapplication

class Burger(name: String, price: Double, description: String): Common(name, price, description) {

    override fun displayInfo() {
        println("$name  | W$price | $description")
    }


}