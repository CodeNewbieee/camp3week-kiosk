package com.example.kiosk

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
// 메인 메뉴판 화면
// 메뉴 선택시 상세 메뉴화면으로 이동
// 잘못된 번호 선택 시 예외처리
// 프로그램 종료을 위한 번호 정의

fun main() {
    SelectMenu().select()
}

