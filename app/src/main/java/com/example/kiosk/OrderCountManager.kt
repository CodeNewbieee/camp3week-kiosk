package com.example.kiosk

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OrderCountManager {
    private var orderCount = 0

    suspend fun printOrderCount(){
        //프로그램이 종료될 때 까지 무한 반복
        while(true){
            delay(5000)
            print("(실시간 주문 대기수: ${orderCount})")
        }
    }

    fun addOrderCount(){
        orderCount++
    }
}
