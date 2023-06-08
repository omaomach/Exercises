package com.omao.charactercounter

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Type a word, number or a sentence")

    var input = scanner.nextLine()
//    var length = input.length
//    println("Length: $length")

    count(input)


}

fun count(text: String) {

    var ch = text.toCharArray()

    var letter = 0
    var space = 0
    var num = 0
    var others = 0

    for (c in ch.withIndex()) {
        if (Character.isLetter(c.value)) {
            letter++
        }else if (Character.isDigit(c.value)) {
            num++
        }else if (Character.isSpaceChar(c.value)) {
            space++
        }else {
            others++
        }
    }

    print("Letters: $letter, \n Spaces: $space, \n Numbers: $num, Others: $others")

}