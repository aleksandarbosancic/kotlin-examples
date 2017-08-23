package com.kotlin.example.kotlinsamples.dto

class PersonDTO(val firstName: String?, val lastName: String?, var age: Int?, var phone: String?) {
    constructor(): this(null, null, null, null)
}