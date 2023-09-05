package com.asiya.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/name")
    public String name(){
        return "Asiya";
    }

    @GetMapping("/age")
    public int age(){
        return 26;    }

    @GetMapping("/address")
    public String address(){
        return "Pune";
    }

}
