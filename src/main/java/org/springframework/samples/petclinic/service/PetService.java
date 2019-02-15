package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
	@Autowired
	private OwnerRepository ownerRepository;
	
	/* GETTERS AND SETTERS */
	public OwnerRepository getOwnerRepository() {
		return ownerRepository;
	}
	
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
}
