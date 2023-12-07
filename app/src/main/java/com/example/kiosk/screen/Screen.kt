package com.example.kiosk.screen

open abstract class Screen {
    abstract fun run():String
    protected abstract fun getInput():String
    protected abstract fun printScreen()
}