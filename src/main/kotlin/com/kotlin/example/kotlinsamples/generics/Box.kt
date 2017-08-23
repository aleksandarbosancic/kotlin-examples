package com.kotlin.example.kotlinsamples.generics

class Box<T>(t: T) {
    var value = t

    override fun toString(): String = "value[$value]"
}