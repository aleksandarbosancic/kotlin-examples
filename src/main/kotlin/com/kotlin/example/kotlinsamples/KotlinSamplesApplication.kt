package com.kotlin.example.kotlinsamples

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSamplesApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSamplesApplication::class.java, *args)
}
