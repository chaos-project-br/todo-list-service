package com.chaos.todolistservice.application.payloads

import com.chaos.todolistservice.domain.entities.Person
import java.time.LocalDateTime

data class TaskResponse(
    val title: String,
    val assign: List<Person>? = null,
    val createdAt: LocalDateTime,
    val endDate: LocalDateTime
)
