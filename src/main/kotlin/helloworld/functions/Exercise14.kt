package org.delcom.helloworld.functions

import kotlin.math.PI

fun circleArea2(radius: Int): Double = PI * radius * radius

fun main() {
    println(circleArea2(2))
}