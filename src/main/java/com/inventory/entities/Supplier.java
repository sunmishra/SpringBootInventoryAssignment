package com.inventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	@Id
	@Column(length = 50)
	//@GeneratedValue
	private int supplierId;
	@Column(length = 50)
	private String supplierName;

	public Supplier() {
	}

	public Supplier(int supplierId, String supplierName) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + "]";
	}

}
