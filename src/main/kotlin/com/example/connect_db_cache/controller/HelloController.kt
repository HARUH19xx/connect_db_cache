package com.example.connect_db_cache.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
class HelloController() {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }
}