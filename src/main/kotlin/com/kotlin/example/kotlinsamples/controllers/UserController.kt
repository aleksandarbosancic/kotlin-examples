package com.kotlin.example.kotlinsamples.controllers

import com.kotlin.example.kotlinsamples.domain.User
import com.kotlin.example.kotlinsamples.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    /** Get the details of a user */
    @RequestMapping("/user/{username}")
    fun getUser(@PathVariable username: String) = userService.getUser(username)

    @GetMapping("/users")
    fun getUsers() = userService.getUsers()

    /**
     * Pretend to create a new user
     * @param user The details of the user to create
     */
    @RequestMapping(value = "/user", method = arrayOf(RequestMethod.POST))
    fun createUser(@RequestBody user: User) = userService.getUser(user)

    /** Cause an error to occur */
    @RequestMapping("/raiseError")
    fun raiseError() {
        throw IllegalArgumentException("This shouldn't have happened")
    }

    /** Handle the error */
    @ExceptionHandler(IllegalArgumentException::class)
    @ResponseStatus(HttpStatus.CONFLICT)
    fun handleError(e: IllegalArgumentException) = e.message

}