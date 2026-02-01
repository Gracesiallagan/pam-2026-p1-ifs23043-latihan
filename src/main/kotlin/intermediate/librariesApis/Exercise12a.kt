package org.delcom.intermediate.librariesApis

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    // Contoh 1: Menggunakan buildList (experimental di beberapa versi)
    val numbers = buildList {
        add(1)
        add(2)
        add(3)
        addAll(listOf(4, 5, 6))
    }
    println("Numbers: $numbers")

    // Contoh 2: Menggunakan buildMap
    val userMap = buildMap {
        put("user1", "Alice")
        put("user2", "Bob")
        put("user3", "Charlie")
    }
    println("User Map: $userMap")

    // Contoh 3: Menggunakan buildSet
    val uniqueItems = buildSet {
        add("Kotlin")
        add("Java")
        add("Python")
        add("Kotlin") // duplikat akan diabaikan
    }
    println("Unique Items: $uniqueItems")
}