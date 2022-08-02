package com.chaos.todolistservice.domain.services.impl

import com.chaos.todolistservice.application.payloads.TaskRequest
import com.chaos.todolistservice.application.payloads.TaskResponse
import com.chaos.todolistservice.domain.entities.Task
import com.chaos.todolistservice.domain.repositories.TaskRepository
import com.chaos.todolistservice.domain.services.TaskService
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TaskServiceImpl(
    private val repository: TaskRepository
) : TaskService {
    override fun createTask(newTask: TaskRequest): TaskResponse {
        try {
            if (newTask.endDate.isEqual(LocalDateTime.now()) ||
                newTask.endDate.isBefore(LocalDateTime.now())
            ) {
                throw Exception("Invalid end date has been inputted")
            }

            repository.save(Task(taskRequest = newTask)).also {
                return TaskResponse(
                    title = it.title,
                    assign = it.assign,
                    createdAt = it.createAt,
                    endDate = it.endDate
                )
            }
        } catch (ex: Exception) {
            throw Exception(ex)
        }
    }
}
