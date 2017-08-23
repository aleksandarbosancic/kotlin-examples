package com.kotlin.example.kotlinsamples.dto

import java.time.Instant

data class UserDTO constructor(val username:String,
                               val screenName: String,
                               val email: String)