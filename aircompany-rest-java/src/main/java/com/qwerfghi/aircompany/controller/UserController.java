package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.User;
import com.qwerfghi.aircompany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/find")
    public User findByUsername(@RequestBody User user) {
        return userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) {
        userService.registerNewUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody User user) {
        user.setUserId(id);
        userService.updateUser(user);
    }
}
