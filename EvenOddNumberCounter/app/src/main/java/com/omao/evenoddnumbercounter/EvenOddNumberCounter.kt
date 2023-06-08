package com.omao.evenoddnumbercounter

fun main() {

    val arr = arrayOf<Int>(1,2,3,4,5,6,7,8)
    var even = 0
    var odd = 0
    for (item in arr.withIndex()) {
        if (arr[item.index] % 2 == 0) {
            even++
        }else {
            odd++
        }
    }
    println("The number of even numbers is: $even \nThe number of odd numbers is: $odd")
}