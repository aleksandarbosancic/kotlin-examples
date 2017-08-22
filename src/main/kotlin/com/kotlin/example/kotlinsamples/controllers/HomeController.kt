package com.kotlin.example.kotlinsamples.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun index(): String = "Hello from kotlin"


    @GetMapping("/test/{value}")
    fun test(@PathVariable value: String) = "Hello : $value"

}