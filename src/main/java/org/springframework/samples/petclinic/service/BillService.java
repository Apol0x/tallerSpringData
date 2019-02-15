package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {
	@Autowired
	private BillRepository billRepository;
	
	/* GETTERS AND SETTERS */
	public BillRepository getBillRepository() {
		return billRepository;
	}
	
	public void setOwnerRepository(BillRepository billRepository) {
		this.billRepository = billRepository;
	}
}
