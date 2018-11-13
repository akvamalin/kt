package com.yevhenii.micro

import org.springframework.stereotype.Service

@Service
class FirstService{
    fun getHello(name: String): String = "Hello, $name"
}