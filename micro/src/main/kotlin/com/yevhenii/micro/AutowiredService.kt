package com.yevhenii.micro

import org.springframework.stereotype.Service

@Service
class AutowiredService {
    fun useAutowired(name: String): String {
        return "This is autowired class, $name"
    }
}
