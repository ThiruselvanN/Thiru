package com.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Electronics.Entity.Laptop;
import com.Electronics.Service.LaptopService;

@RestController
@RequestMapping("/lap")
public class LaptopController {
	
	@Autowired
	LaptopService ls;	
	@PostMapping("/setLaptop")
	public String setLaptop(@RequestBody Laptop l) {
	return ls.setLaptop(l);	
	}
	
	@PostMapping("/setAllLaptop")
	public String setAllLaptop(@RequestBody List<Laptop> l) {
		return ls.setAllLaptop(l);
	}
	
	@GetMapping("/getAll")
	public List<Laptop> getAll(){
		return ls.getAll();
	}
	
	@GetMapping("/getById/{a}")
	public Laptop getById(@PathVariable int a) {
		return ls.getById(a);
	}
	
	@DeleteMapping("/deleById/{b}")
	public String deleById(@PathVariable int b) {
		return ls.deleById(b);
	}
	
	@GetMapping("/getByBrand/{c}")
	public List<Laptop> getByBrand(@PathVariable String c){
		return ls.getByBrand(c);
	}
	
	@GetMapping("/getByRange/{d}/{e}")
	public List<Laptop> getByRange(@PathVariable int d,@PathVariable int e ){
		return ls.getByRange(d,e);
	}
	
	@GetMapping("/getMax")
	public Laptop getMax() {
		return ls.getMax();
	}
	
	@GetMapping("/getRam")
	public List<Laptop> getRam(){
		return ls.getRam();
	}
	
	@GetMapping("/getPrice")
	public List<Laptop> getPrice(){
		return ls.getPrice();
	}
	
	@GetMapping("/getCount/{f}")
	public int getCount(@PathVariable String f) {
		return ls.getCount(f);
		
	}
	
	@GetMapping("/getAl")
	public List<Laptop> getAl(){
		return ls.getAl();
	}
	
	
}
