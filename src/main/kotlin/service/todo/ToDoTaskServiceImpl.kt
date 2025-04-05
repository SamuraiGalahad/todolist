package trotech.service.todo

import org.springframework.stereotype.Service
import trotech.dao.TaskRepository
import trotech.dto.Task

/**
 * Сервис для выполнения
 */
@Service
class ToDoTaskServiceImpl (
    val taskRepository: TaskRepository
): ToDoTaskService {
    override fun addTask(title: String, description: String, userId: Int) {
        if (title.length < 4) {
            throw IllegalArgumentException("Title is too short")
        }
        if (description.length < 10) {
            throw IllegalArgumentException("Description is too short")
        }

    }

    override fun updateTitle(taskId: Int, title: String, userId: Int) {
        TODO("Not yet implemented")
    }

    override fun updateDescription(taskId: Int, description: String, userId: Int) {
        TODO("Not yet implemented")
    }

    override fun updateStatus(taskId: Int, status: Boolean) {
        TODO("Not yet implemented")
    }

    override fun deleteTask(taskId: Int) {
        TODO("Not yet implemented")
    }

    override fun getAllUserTasks(userId: Int): Task {
        TODO("Not yet implemented")
    }

}