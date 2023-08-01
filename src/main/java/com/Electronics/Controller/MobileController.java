package com.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Electronics.Entity.Mobile;
import com.Electronics.Service.MobileService;

@RestController
@RequestMapping("/mob")
public class MobileController {
	
	@Autowired
	MobileService ms;
	@PostMapping("/setMobile")
	public String setMobile(@RequestBody Mobile m) {
		return ms.setMobile(m);
	}
	
	@PostMapping("/setAllMobile")
	public String setAllMobile(@RequestBody List<Mobile> m) {
		return ms.setAllMobile(m);
	}
	
	@GetMapping("/getById/{x}")
	public Mobile getById(@PathVariable int x) {
		return ms.getById(x);
	}
	
	@GetMapping("/getAll")
	public List<Mobile> getAll(){
		return ms.getAll();
	}
	
	@GetMapping("/getByRange/{p1}/{p2}")
	public List<Mobile> getByMobile(@PathVariable int p1,@PathVariable int p2) {
		return ms.getByRange(p1,p2);
	}
	
	@GetMapping("/getMax")
	public Mobile getMax() {
		return ms.getMax();
	}
	
	@GetMapping("/getMin")
	public Mobile getMin() {
		return ms.getMin();
	}
	
	@GetMapping("/getBrand")
	public List<String> getBrand(){
		return ms.getBrand();
	}
	
	@GetMapping("/getBrandByPrice")
	public List<String> getBrandByPrice(){
		return ms.getBrandByPrice();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody Mobile m) {
		return ms.update(id,m);
	}
	
	@PostMapping("/increasePrice")
	public String increasePrice(){
		return ms.increasePrice();
		
	}
	

}
