package trotech.service.todo

import trotech.dto.Task


interface ToDoTaskService {
    fun addTask(title: String, description: String, userId: Int)

    fun updateTitle(taskId: Int, title : String, userId: Int)

    fun updateDescription(taskId: Int, description: String, userId: Int)

    fun updateStatus(taskId: Int, status: Boolean)

    fun deleteTask(taskId: Int)

    fun getAllUserTasks(userId: Int) : Task
}