package com.xib.app1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication


@EnableAutoConfiguration
@SpringBootApplication
class Application {
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
