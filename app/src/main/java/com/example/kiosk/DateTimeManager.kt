package com.example.kiosk

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateTimeManager {

    fun getDateString(): String {
        val currentDate = LocalDate.now()
        val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        return currentDate.format(dateFormatter)
    }

    fun getTimeString():String{
        val currentDateTime = LocalDateTime.now()
        val timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        return currentDateTime.format(timeFormatter)
    }

    fun timeCompare(timeString1:String, timeString2:String):Boolean{
        val time1 = timeString1.split(':')
        val time2 = timeString2.split(':')

        //시 비교
        if(time1[0] < time2[0]) return true
        if (time1[0] == time2[0]){
            //분 비교
            if(time1[1] < time2[1]) return true
            if (time1[1] == time2[1]){
                //초 비교
                return time1[2] < time2[2]
            }
        }
        return false
    }

}