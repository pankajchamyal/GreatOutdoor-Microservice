package com.cg.greatoutdoor.addman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.greatoutdoor.addman.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

	@Query("select b from Address b where b.retailerId = ?1")
	List<Address> getAll(Long retailerId);
}
