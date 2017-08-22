package com.kotlin.example.kotlinsamples.controllers

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StringController {

    /**
     * Perform some string manipulation on the given value
     * @param value The value to manipulate
     * @param operation The operation to perform
     */
    @RequestMapping("/string/{value}")
    fun manipulateString(@PathVariable("value") value: String,
                         @RequestParam(name = "operation", defaultValue = "none") operation: String) : String {
        return when (operation.toUpperCase()) {
            "REVERSE" -> value.reversed()
            "UPPER" -> value.toUpperCase()
            "LOWER" -> value.toLowerCase()
            else -> value
        }
    }

    /*
    * GET /string/Hello -> "Hello"
    * GET /string/Hello?operation=reverse -> "elleH"
    * GET /string/Hello?operation=upper -> "HELLO"
    * GET /string/Hello?operation=lower -> "hello"
    * */

}