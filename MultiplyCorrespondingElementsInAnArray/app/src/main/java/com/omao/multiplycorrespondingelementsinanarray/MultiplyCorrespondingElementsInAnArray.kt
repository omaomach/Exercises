package com.omao.multiplycorrespondingelementsinanarray

fun main() {
    var array1 = arrayOf<Int>(1,2,3,4,5,6)
    var array2 = arrayOf<Int>(6,5,4,3,2,1)

    var result = ""
    for (element in array1.withIndex()) {
        result += (array1[element.index] * array2[element.index])
        result += " "
//        print(element)
    }
    println(result)
}