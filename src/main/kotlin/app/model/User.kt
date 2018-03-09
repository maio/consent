package app.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class User(
    var firstName: String = "",
    var lastName: String = "",
    var password: String = "",
    var username: String = "",
    var email: String = "",
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
)