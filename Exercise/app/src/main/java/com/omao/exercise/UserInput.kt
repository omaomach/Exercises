package com.omao.exercise

class UserInput(var num1: Int, var num2: Int) {
    fun divide(): Int {
        return num1 / num2
    }
    fun remainder(): Int {
        return  num1 % num2
    }
}