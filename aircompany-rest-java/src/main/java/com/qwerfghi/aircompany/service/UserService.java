package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.enums.UserRole;
import com.qwerfghi.aircompany.entity.model.Country;
import com.qwerfghi.aircompany.entity.model.User;
import com.qwerfghi.aircompany.repository.CountryRepository;
import com.qwerfghi.aircompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public User getUserById(int id) {
        return userRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public void registerNewUser(User user) {
        Country country = user.getPerson().getCountry();
        Country persistCountry = countryRepository.findOne(country.getCode());
        user.getPerson().setCountry(persistCountry);
        user.setUserRole(UserRole.USER);
        userRepository.save(user);
    }
}
