package com.omao.greatestnumberfromuserinput

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Input first number")
    var x = scanner.nextInt()
    println("Input second number")
    var y = scanner.nextInt()
    println("Input third number")
    var z = scanner.nextInt()

    if (x > y && x > z) {
        println("The greatest number is: $x")
    } else if (y > x && y > z) {
        println("The greatest number is: $y")
    }else {
        println("The greatest number is: $z")
    }

}