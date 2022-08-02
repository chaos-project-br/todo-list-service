package com.chaos.todolistservice.application.controllers

import com.chaos.todolistservice.application.payloads.TaskRequest
import com.chaos.todolistservice.application.payloads.TaskResponse
import com.chaos.todolistservice.domain.services.TaskService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("task")
class TaskController(
    private val taskService: TaskService
) {

    @PostMapping
    fun createTask(@RequestBody task: TaskRequest): ResponseEntity<TaskResponse> {
        return ResponseEntity.ok(taskService.createTask(task))
    }
}
