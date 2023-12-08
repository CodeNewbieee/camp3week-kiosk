package com.example.kiosk

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class TaskDelayManager {
    fun delayTask3seconds(taskName:String){
        val job = kotlinx.coroutines.GlobalScope.launch{
         println("${taskName} 진행 중입니다...")
         delay(300)
         println("${taskName} 완료되었습니다.")
        }
        runBlocking {
            job.join()
        }
    }
}