package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.UserDTO;
import com.qwerfghi.aircompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public UserDTO getUserById(int id) {
        return userRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(UserDTO userDTO) {
        userRepository.save(userDTO);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    public void updateUser(UserDTO userDTO) {
        userRepository.save(userDTO);
    }
}
