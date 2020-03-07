package com.garmin.android.cursgarmin

fun main(args: Array<String>) {
    "florinaionut".vocals()
}

fun String.vocals(): Int = filter { it in "aeiouAEIOU" }.length

//fun String.vocals() { print(filter { it in "aeiouAEIOU" }.length) }