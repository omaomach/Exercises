package com.omao.areaperimeter

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    println("Please input the radius: ")

    var r = scanner.nextInt()
    var pi = 3.142857
    var perimeter: Double = 2 * pi * r
    var area: Double = pi * r * r

    println(pi)
    println("The area is: $area and the perimeter is: $perimeter")

}