package com.example.kiosk

import java.util.ArrayList

class ShackBurger {
    val menuList = ArrayList<Menu>()
    fun order() {
        while (true) {
            showMenu()
            val selectMenu = readln().toInt()
            when (selectMenu) {
                1 -> {
                    when (showBurgerMenu()) {
                        1 -> {
                            val burger =
                                Burger("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                            burger.displayInfo()
                        }

                        2 -> {
                            val burger =
                                Burger("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                            burger.displayInfo()
                        }

                        3 -> {
                            val burger =
                                Burger(
                                    "Shroom Burger",
                                    9400,
                                    "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
                                )
                            burger.displayInfo()
                        }

                        4 -> {
                            val burger =
                                Burger("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                            burger.displayInfo()
                        }

                        5 -> {
                            val burger =
                                Burger("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거")
                            burger.displayInfo()
                        }

                        0 -> continue

                        else -> println("선택된 메뉴없음")
                    }

                }

                2 -> {
                    when (showFrozenCustardMenu()) {
                        1 -> {
                            val frozenCus = FrozenCustard(
                                "&hacks",
                                5900,
                                "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"
                            )
                            frozenCus.displayInfo()
                        }

                        2 -> {
                            val frozenCus = FrozenCustard(
                                "Shake of the Week",
                                6500,
                                "특별한 커스터드 플레이버"
                            )
                            frozenCus.displayInfo()
                        }

                        3 -> {
                            val frozenCus = FrozenCustard(
                                "Red Bean Shake",
                                6500,
                                "신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크"
                            )
                            frozenCus.displayInfo()
                        }

                        4 -> {
                            val frozenCus = FrozenCustard("Floats", 5900, "루트 비어, 퍼플 카우, 크림시클")
                            frozenCus.displayInfo()
                        }

                        5 -> {
                            val frozenCus =
                                FrozenCustard("Cups & Cons", 5400, "바닐라, 초콜렛, Flavor of the Week")
                            frozenCus.displayInfo()
                        }

                        6 -> {
                            val frozenCus =
                                FrozenCustard("concretes", 5900, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
                            frozenCus.displayInfo()
                        }

                        7 -> {
                            val frozenCus = FrozenCustard(
                                "Shack Attack",
                                5400,
                                "초콜렛 퍼지 소스, 초콜렛 트러플 쿠키, Lumiere 초콜렛 청크와 스프링클이 들어간 진한 초콜렛 커스터드"
                            )
                            frozenCus.displayInfo()

                        }

                        0 -> continue

                        else -> println("선택된 메뉴없음")
                    }
                }

                3 -> when (showDrinksMenu()) {
                    1 -> {
                        val drinks =
                            Drinks("&Shack-made Lemonade", 3900, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)")
                        drinks.displayInfo()
                    }

                    2 -> {
                        val drinks = Drinks("Fresh Brewed Iced Tea", 3400, " 직접 유기농 홍차를 우려낸 아이스티")
                        drinks.displayInfo()
                    }

                    3 -> {
                        val drinks = Drinks("Fifty/Fifty", 6500, "레몬에이드와 아이스티의 만남")
                        drinks.displayInfo()
                    }

                    4 -> {
                        val drinks =
                            Drinks("Fountain Soda", 2700, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
                        drinks.displayInfo()
                    }

                    5 -> {
                        val drinks = Drinks(" Abita Root Beer", 4400, "청량감 있는 독특한 미국식 무알콜 탄산음료")
                        drinks.displayInfo()
                    }

                    6 -> {
                        val drinks = Drinks("Bottled Water", 1000, "지리산 암반대수층으로 만든 프리미엄 생수")
                        drinks.displayInfo()
                    }

                    0 -> continue
                    else -> println("선택된 메뉴없음")
                }


                4 -> when (showBeerMenu()) {
                    1 -> {
                        val beer = Beer(
                            "ShackMeister Ale",
                            9800,
                            "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"
                        )
                        beer.displayInfo()
                    }

                    2 -> {
                        val beer = Beer(
                            "&Magpie Brewing Co.", 6800, ""
                        )
                        beer.displayInfo()
                    }

                    0 -> continue
                    else -> println("선택된 메뉴없음")
                }


                0 -> {
                    println("프로그램 종료")
                    break
                }

                else -> {
                    println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                }
            }
        }
    }
}


private fun showMenu() {
    println("[ SHAKESHACK MENU ]")
    println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drinks          | 매장에서 직접 만드는 음료")
    println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0. 종료            | 프로그램 종료")

}


fun showBurgerMenu(): Int {
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

fun showFrozenCustardMenu(): Int {
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

fun showDrinksMenu(): Int {
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

fun showBeerMenu(): Int {
    println("[ Beer Menu ]")
    println("1. ShackMeister Ale    | ₩ 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주")
    println("2. &Magpie Brewing Co. | ₩ 6.8 | ")
    println("0. 뒤로가기             | 뒤로가기")
    val beerSelect = readln().toInt()
    return beerSelect
}


//Burger("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
//Burger("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
//Burger("Shroom Burger", 9400, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
//Burger("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
//Burger("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거")