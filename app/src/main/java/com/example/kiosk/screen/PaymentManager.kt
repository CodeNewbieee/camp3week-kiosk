package com.example.kiosk.screen

class PaymentManager {
    private var balance = 0

    fun getBalance():Int = balance

    fun deposit(money:Int):Int{
        balance += money
        return balance
    }

    fun withDraw(money:Int):Boolean{
        if(balance < money) return false
        balance -= money
        return true
    }
}