package trotech.dao

import org.springframework.data.jpa.repository.JpaRepository
import trotech.dto.User

interface UserRepository : JpaRepository<User, Long> {
    fun findByUsername(username: String): User?
}