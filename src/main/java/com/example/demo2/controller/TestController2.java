package com.example.demo2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api123")
public class TestController2 {
  
       public TestController2() {
    	   
       }
    
       @GetMapping("/456")
       public String getString() {
           return "Hello World456";
       }

}
