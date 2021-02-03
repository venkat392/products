package com.venkatit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	
	@Id
	@Column(name="PID")
	private int id;  
	
	@Column(name="P_NAME")
	private String pname;  
	
	@Column(name="BATCH_NO")
	private String batchno;  
	
	@Column(name="PRICE")
	private double price;  
	
	
	@Column(name="NO_OF_PRODUCTS")
	private int noofproduct;


	public ProductEntity(int id, String pname, String batchno, double price, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getBatchno() {
		return batchno;
	}


	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNoofproduct() {
		return noofproduct;
	}


	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}


	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", pname=" + pname + ", batchno=" + batchno + ", price=" + price
				+ ", noofproduct=" + noofproduct + ", getId()=" + getId() + ", getPname()=" + getPname()
				+ ", getBatchno()=" + getBatchno() + ", getPrice()=" + getPrice() + ", getNoofproduct()="
				+ getNoofproduct() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}  
	
	
	
	

}
