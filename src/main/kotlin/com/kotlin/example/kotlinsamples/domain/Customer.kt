package com.kotlin.example.kotlinsamples.domain

import java.util.logging.Logger

class Customer(name: String) {

    val logger: Logger = Logger.getLogger(this.javaClass.name)

    init {
        logger.info("Customer initialized with value ${name}")
    }

}