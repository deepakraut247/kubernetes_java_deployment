package com.example.springbootmanagementexample;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SimpleRestController {
    @GetMapping("/health")
    public String health() {
        return "Hello User !! " + new Date();
    }
}
