package com.example.kioskapplication

class Icecream(name: String, price: Double, description: String): Common(name, price, description) {

    override fun displayInfo() {
        println("$name  | W$price | $description")
    }

}