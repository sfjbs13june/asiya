package com.asiya.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/get")
    public String getData(){
        return "Get Data";
    }

    @PostMapping("/post")
    public String postData(){
        return "Post Data";
    }

   @PutMapping("/put")
    public String putData(){
        return "Put Data";
    }

    @DeleteMapping("/delete")
    public String deleteData(){
        return "Delete Data";
    }

}
