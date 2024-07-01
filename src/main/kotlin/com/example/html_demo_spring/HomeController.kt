package com.example.html_demo_spring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun index(): String {
        return "sdgb/index"
    }
    @PostMapping("/views/overview")
    fun overview(): String {
        return "sdgb/views/overview"
    }

    @PostMapping("/views/subscribe")
    fun subscribe(): String {
        return "sdgb/views/subscribe"
    }
    @PostMapping("/views/rank")
    fun rank(): String {
        return "sdgb/views/rank"
    }
    @PostMapping("/views/score")
    fun score(): String {
        return "sdgb/views/score"
    }
}