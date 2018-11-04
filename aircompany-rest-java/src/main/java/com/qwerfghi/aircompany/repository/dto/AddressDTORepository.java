package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDTORepository extends JpaRepository<AddressDTO, Integer> {
}
