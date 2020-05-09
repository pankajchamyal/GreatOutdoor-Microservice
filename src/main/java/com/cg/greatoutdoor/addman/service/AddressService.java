package com.cg.greatoutdoor.addman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.greatoutdoor.addman.entity.Address;
import com.cg.greatoutdoor.addman.model.AddressModel;
import com.cg.greatoutdoor.addman.repository.AddressRepository;

@Service
public class AddressService implements AddressServiceInterface {
	
	@Autowired
	private AddressRepository addressRepository;

	public void addAddress(AddressModel model) {

		Address address = new Address();
		address.setRetailerId(model.getRetailerId());
		address.setAddline(model.getAddline());
		address.setCity(model.getCity());
		address.setPincode(model.getPincode());
		address.setState(model.getState());
		addressRepository.save(address);
	}

	public void deleteAddress(Long addid) {

		addressRepository.deleteById(addid);
	}
	
	public List<Address> getAll(Long retailerId) {

		return addressRepository.getAll(retailerId);
	}

	public void updateAddress(AddressModel model, Long addid) {
		
		Address address = addressRepository.findById(addid).get();
		
		address.setRetailerId(model.getRetailerId());
		address.setAddline(model.getAddline());
		address.setCity(model.getCity());
		address.setPincode(model.getPincode());
		address.setState(model.getState());
		addressRepository.save(address);

	}

	public Address findByIdAddress(Long addid) {
		return addressRepository.findById(addid).get();
	}
}
