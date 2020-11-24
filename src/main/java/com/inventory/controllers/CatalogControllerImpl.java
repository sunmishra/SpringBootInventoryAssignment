package com.inventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Catalog;
import com.inventory.service.CatalogService;

@RestController
public class CatalogControllerImpl {
	@Autowired
	private CatalogService catalogService;

	@GetMapping("/catalog/{sku_code}")
	public String getSupplierName(@PathVariable("sku_code") int sku_code) {
		Catalog catalog =  catalogService.getCatalogById(sku_code);
		return catalog.getSupplier().getSupplierName();
	}

	@PostMapping("/catalog")
	public int insertCatalog(@RequestBody Catalog catalog) {
		Catalog c = catalogService.saveOrUpdate(catalog);
		return c.getSkuCode();
	}
	
//	@GetMapping("/catalog1/{sku_code}")
//	public Catalog getSupplier(@PathVariable int sku_code) {
//		return catalogService.getCatalogById(sku_code);
//	}
}
