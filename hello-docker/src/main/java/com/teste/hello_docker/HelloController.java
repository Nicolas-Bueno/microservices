package com.teste.hello_docker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping("/hello-docker")
    public String getMethodName() {
        return "🐳👋 Olá, Docker! Vamos containerizar o mundo! 🌐🚀";
    }
    
}
