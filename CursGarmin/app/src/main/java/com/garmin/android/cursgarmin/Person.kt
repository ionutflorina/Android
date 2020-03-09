package com.garmin.android.cursgarmin

data class Student(val name: String, val address: String, val grade: Int)

val students = listOf(
    Student("John", "Boston", 6), Student("Jacob", "Baltimore", 2),
    Student("Edward", "New York", 7), Student("William", "Providence", 6),
    Student("Alice", "Philadelphia", 4), Student("Robert", "Boston", 7),
    Student("Richard", "Boston", 10), Student("Steven", "New York", 3)
)

fun main(args: Array<String>) {

    println(students)

    val alphabetical = students.sortedBy { student -> student.name }
    alphabetical.forEach { println(it) }
    alphabetical.forEach { println(it.name) }

    val sortByGradeAndName = students.sortedWith(compareBy({ it.grade }, { it.name }))
    println(sortByGradeAndName)

    val groupByAddress = students.groupBy { it.address }
    println(groupByAddress)
}
