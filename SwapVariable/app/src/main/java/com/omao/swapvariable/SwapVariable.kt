package com.omao.swapvariable

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Input variable a: ")

    var a = scanner.nextInt()
    println("Input variable b: ")
    var b = scanner.nextInt()

    val temp = a
    a = b
    b = temp

    println("Variable a: $a, variable b: $b")
}