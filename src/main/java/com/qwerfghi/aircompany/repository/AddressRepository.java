package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
