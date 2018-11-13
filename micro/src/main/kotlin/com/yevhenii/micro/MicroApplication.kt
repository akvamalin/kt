package com.yevhenii.micro

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class MicroApplication

@Controller
class MyFirstKotlinKontroller(val firstService: FirstService){

    @Autowired
    lateinit var autowiredService:AutowiredService

    @RequestMapping(value="/start/{name}", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun hello(@PathVariable name: String) = firstService.getHello(name)

    @RequestMapping(value="/start", method= arrayOf(RequestMethod.GET))
    @ResponseBody
    fun autowired() = autowiredService.useAutowired("Yevhenii")
}

fun main(args: Array<String>) {
    runApplication<MicroApplication>(*args)
}
