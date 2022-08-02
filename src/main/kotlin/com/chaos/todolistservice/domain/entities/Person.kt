package com.chaos.todolistservice.domain.entities

data class Person(
    val nickname: String,
    val telegram: String,
    val email: String? = null
)
