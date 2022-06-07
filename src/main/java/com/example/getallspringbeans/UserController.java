package com.example.getallspringbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/super-users")
    public String getAllSuperUser() {

        return "All super users are: " + userService.getSuperUsers();
    }
}
