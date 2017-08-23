package com.kotlin.example.kotlinsamples

import com.kotlin.example.kotlinsamples.generics.Box
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSamplesApplication{

    @Bean
    fun init() = CommandLineRunner {
        println("Start app...")

        println("Test generic")

        val box: Box<Int> = Box<Int>(20)
        val box1: Box<String> = Box<String>("test")

        println(box)
        println(box1)

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSamplesApplication::class.java, *args)
}
