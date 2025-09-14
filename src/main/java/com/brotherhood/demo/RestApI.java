package com.brotherhood.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pushtoPAAdmin")
public class RestApI {

    @GetMapping("/fromBH")
    public String getPADATA(){
        return "your data received and inserted into PA DB Sucessfully";
    }
 
}
