package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDTORepository extends JpaRepository<UserDTO, Integer> {
}
