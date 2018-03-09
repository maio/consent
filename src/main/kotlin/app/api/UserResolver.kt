package app.api

import app.dao.UserRepo
import app.model.User
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserResolver(
    private val userRepo : UserRepo
) : GraphQLQueryResolver, GraphQLMutationResolver {

    fun findUserById(id: Long) : User {
        return userRepo.findUserById(id)
    }

    fun findUserByEmail(email: String) : User {
        return userRepo.findUserByEmail(email)
    }

    fun createUser(newUser: User) : User{
        return userRepo.save(newUser)
    }
}