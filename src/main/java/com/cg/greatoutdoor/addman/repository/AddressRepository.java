package com.cg.greatoutdoor.addman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.greatoutdoor.addman.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
