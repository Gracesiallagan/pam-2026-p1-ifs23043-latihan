package org.delcom.intermediate.nullSafety

data class ActiveUser(val username: String, val isActive: Boolean)  // ← Ganti nama

fun getActiveUsernames(users: List<ActiveUser>): List<String> {
    return users.mapNotNull { user ->
        if (user.isActive) user.username else null
    }
}

fun main() {
    val allUsers = listOf(
        ActiveUser("alice123", true),
        ActiveUser("bob_the_builder", false),
        ActiveUser("charlie99", true)
    )

    println(getActiveUsernames(allUsers))
}