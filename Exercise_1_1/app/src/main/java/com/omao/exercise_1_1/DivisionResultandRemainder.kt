package com.omao.exercise_1_1

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    println("Please input the first number: ")

    var x = scanner.nextInt()
    println("Please enter the second number: ")

    var y = scanner.nextInt()

    var result = x / y
    var remainder = x % y

    println("The result is: $result and the remainder is: $remainder")

}