package com.Electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Electronics.Dao.LaptopDao;
import com.Electronics.Entity.Laptop;
@Service
public class LaptopService {
	
	@Autowired
	LaptopDao ld;
	public String setLaptop(Laptop l) {
		return ld.setLaptop(l);
	}
	
	public String setAllLaptop(List<Laptop> l) {
		return ld.setAllLaptop(l);
				
	}

	public List<Laptop> getAll() {
		return ld.getAll();
	}

	public Laptop getById(int a) {
		return ld.getById(a);
	}

	public String deleById(int b) {
		return ld.deleById(b);
	}

	public List<Laptop> getByBrand(String c) {
		return ld.getByBrand(c);
	}

	public List<Laptop> getByRange(int d, int e) {
		return ld.getByRange(d,e);
	}

	public Laptop getMax() {
		return ld.getMax();
	}

	public List<Laptop> getRam() {
		return ld.getRam();
	}

	public List<Laptop> getPrice() {
		return ld.getPrice();
	}

	public int getCount(String f) {
		return ld.getCount(f);
	}

	public List<Laptop> getAl() {
		return ld.getAl();
	}
	
	

}
