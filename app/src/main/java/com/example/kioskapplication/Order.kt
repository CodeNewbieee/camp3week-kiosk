package com.example.kioskapplication

import com.example.hotelreservation.Bank

data class Order(val name: String, val money: Bank = Bank())

fun orderMenu() {
    println("[ORDER MENU]")
    println("5. Order     | 장바구니를 확인 후 주문합니다.")
    println("0. Cancel    | 진행중인 주문을 취소합니다.")
}