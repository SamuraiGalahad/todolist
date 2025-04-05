package trotech.dao

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import trotech.dto.Task

@Repository
interface TaskRepository : CrudRepository<Task, Int>