package com.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.Entity.Mobile;
import com.Electronics.Repository.MobileRepository;
@Repository
public class MobileDao {

	@Autowired
	MobileRepository mr;
	public String setMobile(Mobile m) {
		mr.save(m);
		return "saved";
	}
	
	public String setAllMobile(List<Mobile> m) {
		mr.saveAll(m);
		return "saved again";
	}
	
	public Mobile getById(int x) {
		return mr.findById(x).get();
	}
	
	public List<Mobile> getAll() {
		
		return mr.findAll();
	}
	

}
