package com.chaos.todolistservice.domain.repositories

import com.chaos.todolistservice.domain.entities.Task
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : MongoRepository<Task, ObjectId>
