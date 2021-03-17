package ru.netology

fun main() {
    val amount = 6700
    val comission = amount * 0.0075
    val comissionStart = 3500


    val result = if (amount > comissionStart) comission else amount
    println("Comission: $result")
}