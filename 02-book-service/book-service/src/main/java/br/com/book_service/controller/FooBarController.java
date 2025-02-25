package br.com.book_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name ="Foo bar")
@RestController
@RequestMapping("book-service")
public class FooBarController {

    @Operation(summary = "Foo bar")
    @GetMapping("/foo-bar")
    //@Retry(name = "foo-bar", fallbackMethod = "fallbackMethod")
    //@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
    //@RateLimiter(name = "default")
    @Bulkhead(name = "default")
    public String fooBar(){
        //new RestTemplate().getForEntity("http://localhost:8080/foo-bar", String.class);
        return "Foo-Bar!!!";
    }

    public String fallbackMethod(Exception ex){
        return "fallbackMethod foo-bar!!!";
    }
}
