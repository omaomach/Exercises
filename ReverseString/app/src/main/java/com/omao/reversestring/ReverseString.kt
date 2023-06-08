package com.omao.reversestring

import java.util.Locale
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("Type in string \n")
    var input = scanner.nextLine().toCharArray()  // convert string to characters

    print("Reversed string: \n")
    var reverse = ""
    for (i in input.size -1 downTo 0) {
        reverse += input[i]
    }
    
    println(reverse)

}

//fun reverse(text: String) {
//    var string = text.reversed()
//    println("Your reversed string is:\n$string")
//}