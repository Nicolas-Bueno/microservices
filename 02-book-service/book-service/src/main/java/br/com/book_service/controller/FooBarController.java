package br.com.book_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("book-service")
public class FooBarController {

    @GetMapping("/foo-bar")
    @Retry(name = "foo-bar", fallbackMethod = "fallbackMethod")
    public String fooBar(){
        new RestTemplate().getForEntity("http://localhost:8080/foo-bar", String.class);
        return "Foo-Bar!!!";
    }

    public String fallbackMethod(Exception ex){
        return "fallbackMethod foo-bar!!!";
    }
}
