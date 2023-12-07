package com.example.kiosk

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Exception
import java.text.DecimalFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import kotlin.concurrent.thread
import kotlin.concurrent.timer

class ShackBurger {
    private val menuList = ArrayList<Menu>()
    private var isCoupon = false
    fun order() {

        while (true) {
            showShakeShackMenu()
            if (menuList.isNotEmpty()) showOrderMenu()
            try {
                var selectMenu = readln()!!.toInt()
                when (selectMenu) {
                    1 -> {
                        showBurgerMenu()
                        var input = readln().toInt()
                        while (true) {
                            when (input) {
                                1 -> {
                                    val burger =
                                        Burger(
                                            "ShackBurger",
                                            6900,
                                            "ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                                        )
                                    addMenu(burger)
                                    break
                                }

                                2 -> {
                                    val burger =
                                        Burger(
                                            "SmokeShack",
                                            8900,
                                            "SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                                        )
                                    addMenu(burger)
                                    break
                                }

                                3 -> {
                                    val burger =
                                        Burger(
                                            "Shroom Burger",
                                            9400,
                                            "Shroom Burger | ₩ 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
                                        )
                                    addMenu(burger)
                                    break
                                }

                                4 -> {
                                    val burger =
                                        Burger(
                                            "Cheeseburger",
                                            6900,
                                            "Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                                        )
                                    addMenu(burger)
                                    break
                                }

                                5 -> {
                                    val burger =
                                        Burger(
                                            "Hamburger",
                                            5400,
                                            "Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
                                        )
                                    addMenu(burger)
                                    break
                                }

                                0 -> break

                                else -> {
                                    println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                    input = readln().toInt()
                                }
                            }

                        }
                    }

                    2 -> {
                        showFrozenCustardMenu()
                        var input = readln().toInt()
                        while (true) {
                            when (input) {
                                1 -> {
                                    val frozenCus = FrozenCustard(
                                        "&hacks",
                                        5900,
                                        "&hacks              | ₩ 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"
                                    )
                                    addMenu(frozenCus)
                                    break
                                }

                                2 -> {
                                    val frozenCus = FrozenCustard(
                                        "Shake of the Week",
                                        6500,
                                        "Shake of the Week   | ₩ 6.5 | 특별한 커스터드 플레이버"
                                    )
                                    addMenu(frozenCus)
                                    break
                                }

                                3 -> {
                                    val frozenCus = FrozenCustard(
                                        "Red Bean Shake",
                                        6500,
                                        "Red Bean Shake      | ₩ 6.5 | 신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"
                                    )
                                    addMenu(frozenCus)
                                    break
                                }

                                4 -> {
                                    val frozenCus = FrozenCustard(
                                        "Floats",
                                        5900,
                                        "Floats              | ₩ 5.9 | 루트 비어, 퍼플 카우, 크림시클"
                                    )
                                    addMenu(frozenCus)
                                    break
                                }

                                5 -> {
                                    val frozenCus =
                                        FrozenCustard(
                                            "Cups & Cons",
                                            5400,
                                            "Cups & Cons         | ₩ 5.4 | 바닐라, 초콜렛, Flavor of the Week"
                                        )
                                    addMenu(frozenCus)
                                    break
                                }

                                6 -> {
                                    val frozenCus =
                                        FrozenCustard(
                                            "concretes",
                                            5900,
                                            "concretes           | ₩ 5.9 | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합"
                                        )
                                    addMenu(frozenCus)
                                    break
                                }

                                7 -> {
                                    val frozenCus = FrozenCustard(
                                        "Shack Attack",
                                        5400,
                                        "Shack Attack        | ₩ 5.4 | 초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드"
                                    )
                                    addMenu(frozenCus)
                                    break

                                }

                                0 -> break

                                else -> {
                                    println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                    input = readln().toInt()
                                }
                            }
                        }
                    }

                    3 -> {
                        showDrinksMenu()
                        var input = readln().toInt()
                        while (true) {
                            when (input) {
                                1 -> {
                                    val drinks =
                                        Drinks(
                                            "&Shack-made Lemonade",
                                            3900,
                                            "&Shack-made Lemonade    | ₩ 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)"
                                        )
                                    addMenu(drinks)
                                    break
                                }

                                2 -> {
                                    val drinks = Drinks(
                                        "Fresh Brewed Iced Tea",
                                        3400,
                                        "Fresh Brewed Iced Tea   | ₩ 3.4 | 직접 유기농 홍차를 우려낸 아이스티"
                                    )
                                    addMenu(drinks)
                                    break
                                }

                                3 -> {
                                    val drinks = Drinks(
                                        "Fifty/Fifty",
                                        6500,
                                        "Fifty/Fifty             | ₩ 6.5 | 레몬에이드와 아이스티의 만남"
                                    )
                                    addMenu(drinks)
                                    break
                                }

                                4 -> {
                                    val drinks =
                                        Drinks(
                                            "Fountain Soda",
                                            2700,
                                            "Fountain Soda           | ₩ 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"
                                        )
                                    addMenu(drinks)
                                    break
                                }

                                5 -> {
                                    val drinks = Drinks(
                                        " Abita Root Beer",
                                        4400,
                                        "Abita Root Beer         | ₩ 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료"
                                    )
                                    addMenu(drinks)
                                    break
                                }

                                6 -> {
                                    val drinks = Drinks(
                                        "Bottled Water",
                                        1000,
                                        "Bottled Water           | ₩ 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수"
                                    )
                                    addMenu(drinks)
                                    break
                                }

                                0 -> break
                                else -> {
                                    println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                    input = readln().toInt()
                                }
                            }
                        }
                    }


                    4 -> {
                        showBeerMenu()
                        var input = readln().toInt()
                        while (true) {
                            when (input) {
                                1 -> {
                                    val beer = Beer(
                                        "ShackMeister Ale",
                                        9800,
                                        "ShackMeister Ale    | ₩ 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"
                                    )
                                    addMenu(beer)
                                    break
                                }

                                2 -> {
                                    val beer = Beer(
                                        "&Magpie Brewing Co.",
                                        6800,
                                        "&Magpie Brewing Co. | ₩ 6.8 | "
                                    )
                                    addMenu(beer)
                                    break
                                }

                                0 -> break
                                else -> {
                                    println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                    input = readln().toInt()
                                }
                            }
                        }
                    }

                    5 -> if (menuList.isNullOrEmpty()) {
                        continue
                    } else {        //주문하기

                        while (true) {
                            val current = LocalDateTime.now()
                            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                            val formatted = current.format(formatter)
                            var total :Double = 0.0
                            for (i in 0 until menuList.size) {
                                total += menuList[i].price
                            }
                            var isOrder = false //주문 상태 체크
                            GlobalScope.launch {
                                for (i in 3 downTo 0) {
                                    println("아래와 같이 주문 하시겠습니까? (현재 주문 대기수:$i)")
                                    for (i in 0 until menuList.size) {
                                        println(menuList[i].description)
                                    }
                                    println("[ Total ]")

                                    println("₩ ${(total / 1000.0)}")
                                    println("1. 주문      2. 메뉴판")
                                    delay(3000)
                                    if (isOrder) break //주문완료하면 종료
                                }
                            }


                            val money = 20000
                            val input = readln().toInt()
                            val time = formatted.substring(11, 16).split(":").joinToString("")
                                .toInt() //시간 23시10분 -> 2310
                            if(isCoupon && total>=20000) {
                                total *= 0.9
                            }

                            when (input) {
                                1 -> if (time in 2310..2320) {    //23시10분부터 23시20분까지 결제 불가
                                    println(
                                        "현재 시각은 오후${
                                            formatted.substring(
                                                11,
                                                13
                                            )
                                        }시 ${formatted.substring(14, 16)}분입니다."
                                    )
                                    println("은행 점검 시간은 오후11시 10분 ~ 오후 11시 20분이므로 결제할 수 없습니다.")
                                    runBlocking { launch { delay(5000) } }
                                } else { //23시 10분 ~ 23시 20분 사이가 아니면 money와 total을 비교해서 결제가능하면 결제
                                    if (money < total) {
                                        println("현재 잔액은 ${money / 1000.0}₩ 으로 ${(total - money) / 1000.0}₩이 부족해서 주문할 수 없습니다.")
                                        isOrder = true
                                        break
                                    } else {
                                        println("결제를 완료했습니다. ($formatted) ")
                                        menuList.clear() //결제완료하면 장바구니 비움
                                        isOrder = true
                                        isCoupon = false
                                        break
                                    }
                                }

                                2 -> {   //메뉴판이동
                                    isOrder = true
                                    break
                                }

                                else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            }
                        }
                        runBlocking { launch { delay(3000) } } //3초 후 다른작업
                        continue
                    }

                    6 -> if (menuList.isNullOrEmpty()) continue
                    else {  // 주문취소
                        menuList.clear()
                        println("주문이 취소 되었습니다.")
                    }

                    7 -> {                  //쿠폰발급
                        while (true) {
                            println("₩20.0 이상 구매시 10% 할인 쿠폰을 발급 받으시겠습니까?")
                            println("1. 네       2. 아니오")
                            var input = readln().toInt()

                                when (input) {
                                    1 -> {
                                        isCoupon = true
                                        println("10% 할인 쿠폰이 발급 되었습니다.")
                                        break
                                    }

                                    2 -> {
                                        break
                                    }

                                    else -> {
                                        println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                                    }
                                }
                        }
                    }

                    0 -> {
                        println("프로그램 종료")
                        break
                    }

                    else -> {
                        while (true) {
                            println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            selectMenu = readln().toInt()
                            if (selectMenu in 1..4) {
                                break
                            }
                        }
                    }
                }

            } catch (e: Exception) {
                System.err.println("숫자를 입력 해주세요")
                continue
            }

        }

    }

    private fun addMenu(menu: Menu) {  //장바구니 추가
        println(menu.description)
        println("위 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인      2. 취소")
        while (true) {
            val select = readln().toInt()
            when (select) {
                1 -> {
                    menuList.add(menu)
                    println("${menu.name} 가 장바구니에 추가되었습니다.")
                    break
                }

                2 -> break
                else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
            }
        }
    }
}


private fun showShakeShackMenu() {
    println("[ SHAKESHACK MENU ]")
    println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drinks          | 매장에서 직접 만드는 음료")
    println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("7. 쿠폰 발급")
    println("0. 종료            | 프로그램 종료")

}

private fun showOrderMenu() {
    println(" [ ORDER MENU ] ")
    println("5. Order   | 장바구니를 확인 후 주문합니다.")
    println("6. Cancel  | 진행중인 주문을 취소합니다.")
}


private fun showBurgerMenu() {
    println("[ Burgers Menu ]")
    println("1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    println("2. SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
    println("3. Shroom Burger | ₩ 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    println("4. Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    println("5. Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
    println("0. 뒤로가기       | 뒤로가기")
}

private fun showFrozenCustardMenu() {
    println("[ FrozenCustard Menu ]")
    println("1. &hacks              | ₩ 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")
    println("2. Shake of the Week   | ₩ 6.5 | 특별한 커스터드 플레이버")
    println("3. Red Bean Shake      | ₩ 6.5 | 신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
    println("4. Floats              | ₩ 5.9 | 루트 비어, 퍼플 카우, 크림시클")
    println("5. Cups & Cons         | ₩ 5.4 | 바닐라, 초콜렛, Flavor of the Week")
    println("6. concretes           | ₩ 5.9 | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
    println("7. Shack Attack        | ₩ 5.4 | 초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드")
    println("0. 뒤로가기             | 뒤로가기")

}

private fun showDrinksMenu() {
    println("[ Drinks Menu ]")
    println("1. &Shack-made Lemonade    | ₩ 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")
    println("2. Fresh Brewed Iced Tea   | ₩ 3.4 | 직접 유기농 홍차를 우려낸 아이스티")
    println("3. Fifty/Fifty             | ₩ 6.5 | 레몬에이드와 아이스티의 만남")
    println("4. Fountain Soda           | ₩ 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
    println("5. Abita Root Beer         | ₩ 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
    println("6. Bottled Water           | ₩ 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수")
    println("0. 뒤로가기                 | 뒤로가기")

}

private fun showBeerMenu() {
    println("[ Beer Menu ]")
    println("1. ShackMeister Ale    | ₩ 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
    println("2. &Magpie Brewing Co. | ₩ 6.8 | ")
    println("0. 뒤로가기             | 뒤로가기")
}