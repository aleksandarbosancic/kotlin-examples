package com.kotlin.example.kotlinsamples.domain

class Person(val firstName: String?, val lastName: String?, var age: Int?, var phoneNumber: String?) {
    constructor(): this(null, null, null, null)
}