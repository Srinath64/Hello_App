package com.example.Rest_API_Calls.controller;

import com.example.Rest_API_Calls.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    //UC1
    //http://localhost:8080/hello
    @GetMapping(value = { "/", "" })
    public String sayHello() {
        return "Hello from BridgeLabz !!";
    }

    //UC2
    //http://localhost:8080/hello/query?name=Srinath
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    //UC3
    //http://localhost:8080/hello/param/Srinath
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz";
    }

    //UC4
    //http://localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";
    }

    //UC5
    //http://localhost:8080/hello/put/Srinath/?lastName=S
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return " Hello " + firstName + " " + lastName + " from Bridgelabz";
    }
}
