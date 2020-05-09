package com.cg.greatoutdoor.addman.service;

import java.util.List;

import com.cg.greatoutdoor.addman.entity.Address;
import com.cg.greatoutdoor.addman.model.AddressModel;

public interface AddressServiceInterface {
	
	public void addAddress(AddressModel model);
	public void deleteAddress(Long addid);
	public List<Address> getAll(Long retailerId);
	public void updateAddress(AddressModel model, Long addid);
	public Address findByIdAddress(Long addid);
	
}
