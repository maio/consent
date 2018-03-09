package app.dao

import app.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepo : CrudRepository<User, Long> {
    fun findUserById(id: Long): User
    fun findUserByEmail(email: String): User
}