package com.garmin.android.cursgarmin

import kotlin.math.sqrt

fun main(args: Array<String>) {

    val data = listOf(4, 6, 34, 9, 2, 4, 7)
    println("given list: $data")

    val revData = data.reversed()
    println("reversed list: $revData")

    val noDuplicates = data.distinct()
    println("duplicates removed: $noDuplicates")

    val firstThree = data.take(3)
    println("first three elements: $firstThree")

    val hasAllPositive = data.all { it > 0 }
    if (hasAllPositive) println("has all positive: $data")

    data.forEach { println(sqrt(it.toDouble())) }

    val evenOnly = data.filter { it % 2 == 0 }
    println("only even numbers: $evenOnly")

    val indexOfOdd = data.mapIndexedNotNull { index, it -> if (it % 2 != 0) index else null }
    println("index of odd numbers: $indexOfOdd")

    val allPrime = data.filter { it.isPrime() }
    println("prime numbers: $allPrime")

    val lastPrime = data.findLast { it.isPrime() }
    println("last prime number: $lastPrime")
}


fun Int.isPrime(): Boolean {
    return (2..this / 2).none { this % it == 0 }
}