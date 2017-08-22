package com.kotlin.example.kotlinsamples.services

import com.kotlin.example.kotlinsamples.domain.User
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.time.Instant

@Component
class UserService {

    val allUsers : Array<User> = arrayOf(
            User(
                username = "grahamcox",
                screenName = "Graham",
                email = "grahamcox@example.com",
                registered = Instant.now()
            ),
            User(
                username = "abosancic",
                screenName = "boske",
                email = "abosancic@example.com",
                registered = Instant.now()
            )
    )

    fun getUser(user: User): User {
        return User(
                username = user.username,
                screenName = user.screenName,
                email = user.email,
                registered = Instant.now()
        )
    }

    /** Get the details of a user */
    @RequestMapping("/user/{username}")
    fun getUser(@PathVariable username : String) = allUsers.filter { user -> user.username.equals(username) }.firstOrNull()

    fun getUsers(): Array<User> = allUsers

}