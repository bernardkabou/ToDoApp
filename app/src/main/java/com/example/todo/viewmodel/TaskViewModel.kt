package com.example.todo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.compose.runtime.*
import com.example.todo.data.Task
import com.example.todo.data.TaskRepository

class TaskViewModel(application: Application) : AndroidViewModel(application) {

    private val repo = TaskRepository(application)

    var tasks by mutableStateOf(listOf<Task>())
        private set

    init {
        tasks = repo.loadTasks()
    }

    fun addTask(title: String) {
        val newTask = Task(
            id = (tasks.maxOfOrNull { it.id } ?: 0) + 1,
            title = title
        )
        tasks = tasks + newTask
        repo.saveTasks(tasks)
    }

    fun toggleTask(id: Int) {
        tasks = tasks.map {
            if (it.id == id) it.copy(done = !it.done) else it
        }
        repo.saveTasks(tasks)
    }

    fun deleteTask(id: Int) {
        tasks = tasks.filter { it.id != id }
        repo.saveTasks(tasks)
    }
}