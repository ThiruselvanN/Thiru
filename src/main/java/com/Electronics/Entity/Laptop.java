package com.Electronics.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "electro_details")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	private int ram;
	private String gen;
	private String screenType;
	private String model;
	private String processor;
	private float weight;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getScreentype() {
		return screenType;
	}
	public void setScreentype(String screentype) {
		this.screenType = screenType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Laptop(int id, String brand, int price, String color, int ram, String gen, String screenType, String model,
			String processor, float weight) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.gen = gen;
		this.screenType = screenType;
		this.model = model;
		this.processor = processor;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", ram=" + ram
				+ ", gen=" + gen + ", screenType=" + screenType + ", model=" + model + ", processor=" + processor
				+ ", weight=" + weight + "]";
	}
	
	public Laptop () {
		super();
	}

}
