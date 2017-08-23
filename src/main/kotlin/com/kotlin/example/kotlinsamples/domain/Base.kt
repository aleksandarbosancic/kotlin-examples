package com.kotlin.example.kotlinsamples.domain

open class Base {
    open fun v() {}
    fun nv() {}
}
class Derived() : Base() {
    override fun v() {}
}

open class AnotherDerived() : Base() {
    final override fun v() {}
}

open class Foo {
    open val x: Int get() { return 5 }
}

class Bar1 : Foo() {
    override val x: Int = 2
}