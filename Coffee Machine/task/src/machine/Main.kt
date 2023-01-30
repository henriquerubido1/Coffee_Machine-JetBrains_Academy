 package machine

 class CoffeeMachine {
     fun turnOn() {
         var currMoney = 550
         var availableWater = 400
         var availableMilk = 540
         var availableCoffee = 120
         var availableCups = 9
         var status = true

         while (status) {
             println("Write action (buy, fill, take, remaining, exit): ")

             when (readln()) {
                 "buy" -> {
                     println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                     when (readln()) {
                         "1" -> {
                             if (availableWater < 250) {
                                 println("Sorry, not enough water!")
                             } else if (availableCoffee < 16) {
                                 println("Sorry, not enough coffee beans!")
                             } else if (availableCups < 1) {
                                 println("Sorry, not enough disposable cups!")
                             } else {
                                 println("I have enough resources, making you a coffee!")
                                 availableCups -= 1
                                 availableWater -= 250
                                 availableCoffee -= 16
                                 currMoney += 4
                             }
                         }
                         "2" -> {
                             if (availableWater < 350) {
                                 println("Sorry, not enough water!")
                             } else if (availableMilk < 75) {
                                 println("Sorry, not enough milk!")
                             } else if (availableCoffee < 20) {
                                 println("Sorry, not enough coffee beans!")
                             } else if (availableCups < 1) {
                                 println("Sorry, not enough disposable cups!")
                             } else {
                                 println("I have enough resources, making you a coffee!")
                                 availableCups -= 1
                                 availableWater -= 350
                                 availableMilk -= 75
                                 availableCoffee -= 20
                                 currMoney += 7
                             }
                         }
                         "3" -> {
                             if (availableWater < 200) {
                                 println("Sorry, not enough water!")
                             } else if (availableMilk < 100) {
                                 println("Sorry, not enough milk!")
                             } else if (availableCoffee < 12) {
                                 println("Sorry, not enough coffee beans!")
                             } else if (availableCups < 1) {
                                 println("Sorry, not enough disposable cups!")
                             } else {
                                 println("I have enough resources, making you a coffee!")
                                 availableCups -= 1
                                 availableWater -= 200
                                 availableMilk -= 100
                                 availableCoffee -= 12
                                 currMoney += 6
                             }
                         }
                         "back" -> continue
                     }
                 }
                 "fill" -> {
                     println("Write how many ml of water you want to add:")
                     availableWater += readln().toInt()
                     println("Write how many ml of milk you want to add:")
                     availableMilk += readln().toInt()
                     println("Write how many grams of coffee beans you want to add:")
                     availableCoffee += readln().toInt()
                     println("Write how many disposable cups you want to add:")
                     availableCups += readln().toInt()
                 }
                 "take" -> {
                     println("I gave you $$currMoney")
                     currMoney = 0
                 }
                 "remaining" -> println(
                     "The coffee machine has:\n"
                             + "$availableWater ml of water\n"
                             + "$availableMilk ml of milk\n"
                             + "$availableCoffee g of coffee beans\n"
                             + "$availableCups disposable cups\n"
                             + "$$currMoney of money"
                 )
                 "exit" -> status = false
             }
         }
     }
 }

 fun main () {
     val coffeeMachine = CoffeeMachine()
     coffeeMachine.turnOn()
 }
