package com.example.kioskapplication

import com.example.hotelreservation.Bank

data class Order(val name: String, val money: Bank = Bank())