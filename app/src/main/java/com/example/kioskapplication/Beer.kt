package com.example.kioskapplication

class Beer(name: String, price: Double, description: String): Common(name, price, description) {

    override fun displayInfo() {
        println("$name  | W$price | $description")
    }

}