package com.chaos.todolistservice.application.payloads

import com.chaos.todolistservice.domain.entities.Person
import org.springframework.validation.annotation.Validated
import java.time.LocalDateTime

@Validated
data class TaskRequest(
    val title: String,
    val subtitle: String? = null,
    val description: String,
    val assign: List<Person>? = null,
    val endDate: LocalDateTime
)
