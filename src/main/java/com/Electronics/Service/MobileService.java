package com.Electronics.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Electronics.Dao.MobileDao;
import com.Electronics.Entity.Mobile;
@Service
public class MobileService {

	@Autowired
	MobileDao md;
	public String setMobile(Mobile m) {
		return md.setMobile(m);
	}
	
	public String setAllMobile(List<Mobile> m) {
		return md.setAllMobile(m);
	}

	public Mobile getById(int x) {
		return md.getById(x);
	}

	public List<Mobile> getAll() {
		return md.getAll();
	}

	public List<Mobile> getByRange(int p1, int p2) {
		List <Mobile> x = getAll();
		List <Mobile> z = x.stream().filter(y->y.getPrice()>=p1 && y.getPrice()<=p2).collect(Collectors.toList());
		return z;
	}

	public Mobile getMax() {
		List<Mobile> x = getAll();
		Mobile z = x.stream().max(Comparator.comparingInt(Mobile::getPrice)).get();
		return z;	
	}

	public Mobile getMin() {
		List<Mobile> x = getAll();
		Mobile z = x.stream().min(Comparator.comparingInt(Mobile::getPrice)).get();
		return z;
	}

	public List<String> getBrand() {
		List <Mobile> x = getAll();
		List <String> z = x.stream().map(y->y.getBrand()).collect(Collectors.toList());
		return z;
	}

	public List<String> getBrandByPrice() {
		List <Mobile> x = getAll();
		List <String> y = x.stream().sorted(Comparator.comparingInt(Mobile::getPrice).reversed()).map(m->m.getBrand()).toList();
		return y;
	}

	public String update(int id, Mobile m) {
		Mobile x = getById(id);
		Mobile y = m;
		
		x.setBrand(y.getBrand());
		setMobile(x);
		return "updated";
		
	}

	public String increasePrice() {
		List<Mobile> y = getAll();
		List<Mobile> z = y.stream().filter(x->x.getRam()>=6).peek(x->x.setPrice(x.getPrice()+5000)).toList();
		setAllMobile(z);
		return "updated";
	}
	

	

	
}
