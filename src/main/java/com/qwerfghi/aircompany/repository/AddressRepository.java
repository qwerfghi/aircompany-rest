package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.AddressDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressDTO, Integer> {
}
