package org.delcom.helloworld.classes

data class Employee2(val name: String, var salary: Int)

fun main() {
    val emp = Employee2("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}