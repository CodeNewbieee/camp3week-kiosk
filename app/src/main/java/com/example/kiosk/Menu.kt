package com.example.kiosk

abstract class Menu(val name: String,val price: Int,val description: String) {
    abstract fun displayInfo()
}