package com.example.html_demo_spring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    @PostMapping("/furtherInfo")
    fun furtherInfo(): String {
        return "furtherInfo"
    }
}