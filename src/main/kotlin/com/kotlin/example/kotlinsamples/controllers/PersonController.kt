package com.kotlin.example.kotlinsamples.controllers

import com.kotlin.example.kotlinsamples.domain.User
import com.kotlin.example.kotlinsamples.services.PersonService
import com.kotlin.example.kotlinsamples.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.time.Instant

@RestController
class PersonController {

    @Autowired
    lateinit var personService: PersonService

    @GetMapping("/persons")
    fun getUsers() = personService.getPersons()

}