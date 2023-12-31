package com.example.usermanagment.controller;

import com.example.usermanagment.model.User;
import com.example.usermanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User saveUser(@RequestBody User user) {
        return  userService.saveUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
       User user = null;
       user = userService.getUserById(id);
       return  ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUserById(@PathVariable("id") Long id){
        boolean deleted = false;
        deleted = userService.deleteUserById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return  ResponseEntity.ok(response);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        user = userService.updateUser(id, user);
        return  ResponseEntity.ok(user);
    }
}
