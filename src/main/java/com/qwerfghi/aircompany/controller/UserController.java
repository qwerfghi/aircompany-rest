package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.UserDTO;
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
    public UserDTO getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/find")
    public User findByUsername(@RequestBody UserDTO userDTO) {
        return userService.findByUsernameAndPassword(userDTO.getUsername(), userDTO.getPassword());
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }

    @PostMapping("/register")
    public void addUser(@RequestBody User user) {
        userService.registerNewUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody UserDTO userDTO) {
        userDTO.setUserId(id);
        userService.updateUser(userDTO);
    }
}
