package com.chaos.todolistservice.domain.entities

import com.chaos.todolistservice.application.payloads.TaskRequest
import java.time.LocalDateTime

data class Task(
    val title: String,
    val subtitle: String? = null,
    val description: String,
    val assign: List<Person>? = null,
    val createAt: LocalDateTime = LocalDateTime.now(),
    val endDate: LocalDateTime
) {
    constructor(taskRequest: TaskRequest) : this(
        title = taskRequest.title,
        subtitle = taskRequest.subtitle,
        description = taskRequest.description,
        assign = taskRequest.assign,
        endDate = taskRequest.endDate
    )
}
