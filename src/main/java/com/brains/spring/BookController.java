package com.brains.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@GetMapping("/")
    public String home() {
        return "Welcome to the Book API!";
    }

}
