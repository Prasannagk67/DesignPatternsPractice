package com.design.creational.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}

//Lazy Loading Single Design Pattern
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    UserService userService = UserService.getUserservice();
//    @GetMapping
//    public List<User> getAllUsers(){
//        return userService.getAllUsers();
//    }
//}

//Eager Loading Design Pattern
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    @GetMapping
//    public List<User> getAllUsers(){
//        return UserService.getUserService().getAllUsers();
//    }
//}
