package com.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.Entity.Laptop;
import com.Electronics.Repository.LaptopRepository;
@Repository
public class LaptopDao {
	
	@Autowired
	LaptopRepository lr;
	public String setLaptop(Laptop l) {
		lr.save(l);
		return "saved";
	}
	
	public String setAllLaptop(List<Laptop> l) {
		lr.saveAll(l);
		return "saved again";
	}
	
	public List<Laptop> getAll() {
		return lr.findAll();
	}

	public Laptop getById(int a) {
		return lr.findById(a).get();
	}

	public String deleById(int b) {
		lr.deleteById(b);
		return "deleted";
	}

	public List<Laptop> getByBrand(String c) {
		return lr.getByBrand(c);
	}

	public List<Laptop> getByRange(int d, int e) {
		return lr.getByRange(d,e);
	}

	public Laptop getMax() {
		return lr.getMax();
	}

	public List<Laptop> getRam() {
		return lr.getRam();
	}

	public List<Laptop> getPrice() {
		return lr.getPrice();
	}

	public int getCount(String f) {
		return lr.getCount(f);
	}

	public List<Laptop> getAl() {
		return lr.findAll();
	}
	
	

}
