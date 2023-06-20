package com.example.pipedemo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.time.LocalDateTime


@SpringBootApplication
class PipedemoApplication

fun main(args: Array<String>) {
    runApplication<PipedemoApplication>(*args)
}

@RestController
class RestController {
    var count = 0

    @GetMapping("/")
    fun hello(): String {
        count = count.inc()
        return "hello world with a twist: count $count on date ${LocalDateTime.now().toLocalTime()}"
    }
}
