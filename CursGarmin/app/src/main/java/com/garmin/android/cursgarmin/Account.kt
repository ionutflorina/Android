package com.garmin.android.cursgarmin

fun main(args: Array<String>) {
    val creditAccount = Account()
    val savingAccount = SavingAccount()
    creditAccount.withdrawMoney(1200.00)
    creditAccount.depositMoney(200.00)
    savingAccount.withdrawMoney(2100.00)
}

open class Account() {
    var amount: Double = 2000.00

    open fun withdrawMoney(withdrawnAmount: Double): Any = amount - withdrawnAmount
//    open fun withdrawMoney(withdrawnAmount: Double) { println(amount - withdrawnAmount) }

    fun depositMoney(depositedAmount: Double): Double = amount + depositedAmount
//    fun depositMoney(depositedAmount: Double) { println(amount + depositedAmount) }
}

class SavingAccount : Account() {
    override fun withdrawMoney(withdrawnAmount: Double): Any =
        if (amount > 0 && withdrawnAmount <= amount) amount - withdrawnAmount else "not enough money"
//    override fun withdrawMoney(withdrawnAmount: Double) {
//        if (amount > 0 && withdrawnAmount <= amount)
//            println(amount - withdrawnAmount) else println("not enough money")
//    }
}