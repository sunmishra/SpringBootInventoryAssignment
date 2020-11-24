package com.inventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Supplier;
import com.inventory.service.SupplierService;

@RestController
public class SupplierControllerImpl {
	@Autowired
	private SupplierService supplierService;

//	@GetMapping("/supplier/{supplier_id}")
//	public Supplier getSupplier(@PathVariable int supplier_id) {
//		return supplierService.getSupplierById(supplier_id);
//	}

	@PostMapping("/supplier")
	public int insertSupplier(@RequestBody Supplier supplier) {
		Supplier s = supplierService.saveOrUpdate(supplier);
		return s.getSupplierId();
	}


}
