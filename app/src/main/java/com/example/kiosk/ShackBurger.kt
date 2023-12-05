package com.example.kiosk

import java.lang.Exception
import java.text.DecimalFormat
import java.util.ArrayList

class ShackBurger {
    private val menuList = ArrayList<Menu>()
    fun order() {
        while (true) {
            showShakeShackMenu()
            if (menuList.isNotEmpty()) showOrderMenu()
            try{
                val selectMenu = readln().toInt()
                when (selectMenu) {
                    1 -> {
                        when (showBurgerMenu()) {
                            1 -> {
                                val burger =
                                    Burger(
                                        "ShackBurger",
                                        6900,
                                        "ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거"
                                    )
                                addMenu(burger)

                            }

                            2 -> {
                                val burger =
                                    Burger(
                                        "SmokeShack",
                                        8900,
                                        "SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
                                    )
                                addMenu(burger)

                            }

                            3 -> {
                                val burger =
                                    Burger(
                                        "Shroom Burger",
                                        9400,
                                        "Shroom Burger | ₩ 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
                                    )
                                addMenu(burger)
                            }

                            4 -> {
                                val burger =
                                    Burger(
                                        "Cheeseburger",
                                        6900,
                                        "Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
                                    )
                                addMenu(burger)
                            }

                            5 -> {
                                val burger =
                                    Burger(
                                        "Hamburger",
                                        5400,
                                        "Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
                                    )
                                addMenu(burger)
                            }

                            0 -> continue

                            else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                        }

                    }

                    2 -> {
                        when (showFrozenCustardMenu()) {
                            1 -> {
                                val frozenCus = FrozenCustard(
                                    "&hacks",
                                    5900,
                                    "&hacks              | ₩ 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"
                                )
                                addMenu(frozenCus)
                            }

                            2 -> {
                                val frozenCus = FrozenCustard(
                                    "Shake of the Week",
                                    6500,
                                    "Shake of the Week   | ₩ 6.5 | 특별한 커스터드 플레이버"
                                )
                                addMenu(frozenCus)
                            }

                            3 -> {
                                val frozenCus = FrozenCustard(
                                    "Red Bean Shake",
                                    6500,
                                    "Red Bean Shake      | ₩ 6.5 | 신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"
                                )
                                addMenu(frozenCus)
                            }

                            4 -> {
                                val frozenCus = FrozenCustard(
                                    "Floats",
                                    5900,
                                    "Floats              | ₩ 5.9 | 루트 비어, 퍼플 카우, 크림시클"
                                )
                                addMenu(frozenCus)
                            }

                            5 -> {
                                val frozenCus =
                                    FrozenCustard(
                                        "Cups & Cons",
                                        5400,
                                        "Cups & Cons         | ₩ 5.4 | 바닐라, 초콜렛, Flavor of the Week"
                                    )
                                addMenu(frozenCus)
                            }

                            6 -> {
                                val frozenCus =
                                    FrozenCustard(
                                        "concretes",
                                        5900,
                                        "concretes           | ₩ 5.9 | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합"
                                    )
                                addMenu(frozenCus)
                            }

                            7 -> {
                                val frozenCus = FrozenCustard(
                                    "Shack Attack",
                                    5400,
                                    "Shack Attack        | ₩ 5.4 | 초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드"
                                )
                                addMenu(frozenCus)

                            }

                            0 -> continue

                            else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                        }
                    }

                    3 -> when (showDrinksMenu()) {
                        1 -> {
                            val drinks =
                                Drinks(
                                    "&Shack-made Lemonade",
                                    3900,
                                    "&Shack-made Lemonade    | ₩ 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)"
                                )
                            addMenu(drinks)
                        }

                        2 -> {
                            val drinks = Drinks(
                                "Fresh Brewed Iced Tea",
                                3400,
                                "Fresh Brewed Iced Tea   | ₩ 3.4 | 직접 유기농 홍차를 우려낸 아이스티"
                            )
                            addMenu(drinks)
                        }

                        3 -> {
                            val drinks = Drinks(
                                "Fifty/Fifty",
                                6500,
                                "Fifty/Fifty             | ₩ 6.5 | 레몬에이드와 아이스티의 만남"
                            )
                            addMenu(drinks)
                        }

                        4 -> {
                            val drinks =
                                Drinks(
                                    "Fountain Soda",
                                    2700,
                                    "Fountain Soda           | ₩ 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"
                                )
                            addMenu(drinks)
                        }

                        5 -> {
                            val drinks = Drinks(
                                " Abita Root Beer",
                                4400,
                                "Abita Root Beer         | ₩ 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료"
                            )
                            addMenu(drinks)
                        }

                        6 -> {
                            val drinks = Drinks(
                                "Bottled Water",
                                1000,
                                "Bottled Water           | ₩ 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수"
                            )
                            addMenu(drinks)
                        }

                        0 -> continue
                        else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                    }


                    4 -> when (showBeerMenu()) {
                        1 -> {
                            val beer = Beer(
                                "ShackMeister Ale",
                                9800,
                                "ShackMeister Ale    | ₩ 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"
                            )
                            addMenu(beer)
                        }

                        2 -> {
                            val beer = Beer(
                                "&Magpie Brewing Co.", 6800, "&Magpie Brewing Co. | ₩ 6.8 | "
                            )
                            addMenu(beer)
                        }

                        0 -> continue
                        else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                    }

                    5 -> {
                        while (true) {
                            println("아래와 같이 주문 하시겠습니까?")
                            println("[ Orders ]")
                            for (i in 0 until menuList.size) {
                                println(menuList[i].description)
                            }
                            println("[ Total ]")
                            var total = 0
                            for (i in 0 until menuList.size) {
                                total += menuList[i].price
                            }
                            println("₩ ${(total / 1000.0)}")
                            println("1. 주문      2. 메뉴판")
                            val input = readln().toInt()

                            when (input) {
                                1 -> {
                                        println("잔액 부족으로 주문할 수 없습니다.")
                                }

                                2 -> break
                                else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                            }
                        }
                    }

                    6 -> {
                        menuList.clear()
                        println("주문이 취소 되었습니다.")
                    }

                    0 -> {
                        println("프로그램 종료")
                        break
                    }

                    else -> println("잘못된 번호를 입력했어요 다시 입력해주세요.")

                }
            }catch (e:Exception){
                println("숫자를 입력 해주세요")
                continue
            }
    }
    }

    private fun addMenu(burger: Menu) {
        println("${burger.description}")
        println("위 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인      2. 취소")
        while (true) {
            val select = readln().toInt()
            when (select) {
                1 -> {
                    menuList.add(burger)
                    println("${burger.name} 가 장바구니에 추가되었습니다.")
                    break
                }

                2 -> break
                else -> println("1, 2중 선택해주세요")
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
    println("0. 종료            | 프로그램 종료")

}
private fun showOrderMenu(){
    println(" [ ORDER MENU ] ")
    println("5. Order   | 장바구니를 확인 후 주문합니다.")
    println("6. Cancel  | 진행중인 주문을 취소합니다.")
}


private fun showBurgerMenu(): Int {
    println("[ Burgers Menu ]")
    println("1. ShackBurger   | ₩ 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
    println("2. SmokeShack    | ₩ 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
    println("3. Shroom Burger | ₩ 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
    println("4. Cheeseburger  | ₩ 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
    println("5. Hamburger     | ₩ 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
    println("0. 뒤로가기       | 뒤로가기")
    val burgerSelect = readln().toInt()
    return burgerSelect
}

private fun showFrozenCustardMenu(): Int {
    println("[ FrozenCustard Menu ]")
    println("1. &hacks              | ₩ 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")
    println("2. Shake of the Week   | ₩ 6.5 | 특별한 커스터드 플레이버")
    println("3. Red Bean Shake      | ₩ 6.5 | 신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
    println("4. Floats              | ₩ 5.9 | 루트 비어, 퍼플 카우, 크림시클")
    println("5. Cups & Cons         | ₩ 5.4 | 바닐라, 초콜렛, Flavor of the Week")
    println("6. concretes           | ₩ 5.9 | 쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
    println("7. Shack Attack        | ₩ 5.4 | 초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드")
    println("0. 뒤로가기             | 뒤로가기")
    val frozenCustardSelect = readln().toInt()
    return frozenCustardSelect
}

private fun showDrinksMenu(): Int {
    println("[ Drinks Menu ]")
    println("1. &Shack-made Lemonade    | ₩ 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")
    println("2. Fresh Brewed Iced Tea   | ₩ 3.4 | 직접 유기농 홍차를 우려낸 아이스티")
    println("3. Fifty/Fifty             | ₩ 6.5 | 레몬에이드와 아이스티의 만남")
    println("4. Fountain Soda           | ₩ 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
    println("5. Abita Root Beer         | ₩ 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
    println("6. Bottled Water           | ₩ 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수")
    println("0. 뒤로가기                 | 뒤로가기")
    val drinkSelect = readln().toInt()
    return drinkSelect
}

private fun showBeerMenu(): Int {
    println("[ Beer Menu ]")
    println("1. ShackMeister Ale    | ₩ 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
    println("2. &Magpie Brewing Co. | ₩ 6.8 | ")
    println("0. 뒤로가기             | 뒤로가기")
    val beerSelect = readln().toInt()
    return beerSelect
}