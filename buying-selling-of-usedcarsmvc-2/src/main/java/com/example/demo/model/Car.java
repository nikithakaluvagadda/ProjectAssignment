package com.example.demo.model;


import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car {

	
	String model;
	String year;
	long kilometers;
	String brand;
	String status;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String model, String year, long kilometers, String brand, String status) {
		super();
		this.model = model;
		this.year = year;
		this.kilometers = kilometers;
		this.brand = brand;
		this.status = status;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public long getKilometers() {
		return kilometers;
	}
	public void setKilometers(long kilometers) {
		this.kilometers = kilometers;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Cars [model=" + model + ", year=" + year + ", kilometers=" + kilometers + ", brand=" + brand
				+ ", status=" + status + "]";
	}
}

