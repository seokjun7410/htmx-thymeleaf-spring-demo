package com.example.html_demo_spring

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun index(model: Model): String {
        val video1 = Video(
            "title1",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val video2 = Video(
            "title2",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val video3 = Video(
            "title3",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val videos = listOf(video1, video2, video3)
        model.addAttribute("videos", videos)
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

    @GetMapping("/views/demo")
    fun demo(model: Model): String {
        val video1 = Video(
            "title1",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val video2 = Video(
            "title2",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val video3 = Video(
            "title3",
            "https://miro.medium.com/v2/resize:fit:1036/format:webp/0*qrHSfE71UUbFrmH6"
        )
        val videos = listOf(video1, video2, video3)
        model.addAttribute("videos", videos)
        return "sdgb/views/demo"
    }
}

data class Video(val title: String, val thumbnailUrl: String)