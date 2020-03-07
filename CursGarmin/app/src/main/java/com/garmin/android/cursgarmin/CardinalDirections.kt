package com.garmin.android.cursgarmin

fun main(args: Array<String>) {
    getCardinalByAngle(60)
}

fun getCardinalByAngle(angle: Int) {
    when (angle) {
        in 0..90 -> {
            when (angle) {
                0 -> print("E")
                90 -> print("N")
                else -> print("N-E")
            }
        }
        in 91..180 -> {
            when (angle) {
                180 -> print("W")
                else -> print("N-W")
            }
        }
        in 181..270 -> {
            when (angle) {
                270 -> print("S")
                else -> print("S-W")
            }
        }
        in 271..359 -> {
            print("S-E")
        }
        else -> print("give a correct angle")
    }
}