package com.chaos.todolistservice.domain.services

import com.chaos.todolistservice.application.payloads.TaskRequest
import com.chaos.todolistservice.application.payloads.TaskResponse

interface TaskService {
    fun createTask(newTask: TaskRequest): TaskResponse
}
