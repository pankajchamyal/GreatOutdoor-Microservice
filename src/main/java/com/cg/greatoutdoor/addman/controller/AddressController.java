package com.cg.greatoutdoor.addman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.greatoutdoor.addman.entity.Address;
import com.cg.greatoutdoor.addman.model.AddressModel;
import com.cg.greatoutdoor.addman.service.AddressService;

@RestController
@CrossOrigin
public class AddressController {
	@Autowired
	private AddressService addressService;
	@PostMapping("/address/add")
	public void addAddress(@RequestBody AddressModel model)
	{
		addressService.addAddress(model);
	}
	@DeleteMapping("/address/delete/{addid}")
	public void deleteAddress(@PathVariable Long addid) {
		addressService.deleteAddress(addid);
	}
	
	@GetMapping("/address/all")
	public List<Address> getAddress() {
		return addressService.getAll();
	}
	
	@GetMapping("/address/{addid}")
	public Address findByIdAddress(@PathVariable Long addid) {
		return addressService.findByIdAddress(addid);
	}
	
	@PutMapping("/address/update/{addid}")
	public void updateAddress(@RequestBody AddressModel model, @PathVariable Long addid)
	{
		addressService.updateAddress(model, addid);
	}

}
	