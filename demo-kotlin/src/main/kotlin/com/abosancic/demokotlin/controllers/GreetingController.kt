/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abosancic.demokotlin.controllers

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.abosancic.demokotlin.model.Greeting
/*

  @author AleksandarBosancic
  Created on 15-Feb-2018
*/

@RestController
class GreetingController {

    val id = AtomicLong()
    
    // http://localhost:8080/geeting?name=nesto
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = Greeting(id.incrementAndGet(), "Hello, $name")
    
    @GetMapping("/test")
    fun test(@RequestParam(value = "id") id: Long, @RequestParam(value = "message") message: String) = Greeting(id, message)
    
}