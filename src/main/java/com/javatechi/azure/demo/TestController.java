package com.javatechi.azure.demo;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TestController {
 
    @GetMapping("/message") 
    public String message()
    {
        return "Hello AZURE - ESSID from Controller!.";
    }
}