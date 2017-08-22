package com.kotlin.example.kotlinsamples

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSamplesApplication{

    @Bean
    fun init() = CommandLineRunner {
        println("Start app...")
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSamplesApplication::class.java, *args)
}
