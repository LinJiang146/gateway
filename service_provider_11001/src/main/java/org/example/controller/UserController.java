package org.example.controller;


import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserController {
    @GetMapping("/hello")
    public String Hello(){
        System.out.println("hello");
        return "Hello World";
    }

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable Integer userId){

        User u = new User(userId,"aaa","123456");
        return new CommonResult<>(200,"success(11000)",u);

    }
}
