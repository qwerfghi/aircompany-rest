package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer> {
}
