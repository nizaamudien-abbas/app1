package com.xib.app1.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.swagger2.annotations.EnableSwagger2

@RestController
@EnableSwagger2
@EnableAutoConfiguration
class App1Controller {

    @Value("\${message1:message1 default}")
    private val message1: String? = null

    @Value("\${message2:message2 default}")
    private val message2: String? = null

    @RequestMapping(method = [RequestMethod.GET], value = ["/messages"])
    fun getMessages(): Array<String?> {
        return arrayOf(this.message1, this.message2)
    }
}