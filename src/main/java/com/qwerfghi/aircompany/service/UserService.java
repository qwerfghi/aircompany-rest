package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.UserDTO;
import com.qwerfghi.aircompany.entity.enums.UserRole;
import com.qwerfghi.aircompany.entity.model.Country;
import com.qwerfghi.aircompany.entity.model.User;
import com.qwerfghi.aircompany.repository.CountryRepository;
import com.qwerfghi.aircompany.repository.UserRepository;
import com.qwerfghi.aircompany.repository.dto.AddressDTORepository;
import com.qwerfghi.aircompany.repository.dto.UserDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserDTORepository userDTORepository;
    private final UserRepository userRepository;
    private final AddressDTORepository addressDTORepository;
    private final CountryRepository countryRepository;

    @Autowired
    public UserService(UserDTORepository userDTORepository, UserRepository userRepository, AddressDTORepository addressDTORepository, CountryRepository countryRepository) {
        this.userDTORepository = userDTORepository;
        this.userRepository = userRepository;
        this.addressDTORepository = addressDTORepository;
        this.countryRepository = countryRepository;
    }

    @Transactional(readOnly = true)
    public UserDTO getUserById(int id) {
        return userDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<UserDTO> getAllUsers() {
        return userDTORepository.findAll();
    }

    public void addUser(UserDTO userDTO) {
        userDTORepository.save(userDTO);
    }

    public void deleteUser(int id) {
        userDTORepository.delete(id);
    }

    public void updateUser(UserDTO userDTO) {
        userDTORepository.save(userDTO);
    }

    public void registerNewUser(User user) {
        Country country = user.getPerson().getCountry();
        Country persistCountry = countryRepository.findOne(country.getCode());
        user.getPerson().setCountry(persistCountry);
        user.setUserRole(UserRole.USER);
        userRepository.save(user);
    }
}
