package com.example.getallspringbeans;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<String> getSuperUsers() {

        final List<String> superUsers = new ArrayList<>();
        superUsers.add("Ajay");
        superUsers.add("Reena");
        superUsers.add("Gaurav");

        return superUsers;
    }
}
