package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.enums.UserRole;
import com.qwerfghi.aircompany.entity.model.User;
import com.qwerfghi.aircompany.repository.CountryRepository;
import com.qwerfghi.aircompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final CountryRepository countryRepository;

    @Autowired
    public UserService(UserRepository userRepository, CountryRepository countryRepository) {
        this.userRepository = userRepository;
        this.countryRepository = countryRepository;
    }

    @Transactional(readOnly = true)
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public Optional<User> registerNewUser(User user) {
        user.setUserRole(UserRole.USER);
        return countryRepository.findById(user.getPerson().getCountry().getCode())
                .map(country -> {
                    user.getPerson().setCountry(country);
                    return userRepository.save(user);
                });
    }
}
