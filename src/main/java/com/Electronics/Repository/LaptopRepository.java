package com.Electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Electronics.Entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
	
	@Query(value = "Select * from electro_details where brand Like?",nativeQuery = true)
	List<Laptop> getByBrand(String c);
	
	@Query(value = "Select * from electro_details where price >? and price <?",nativeQuery = true)
	List<Laptop> getByRange(int d, int e);
	
	@Query(value = "Select * from electro_details where price = (select max(price) from electro_details)",nativeQuery = true)
	Laptop getMax();

	@Query(value = "Select * from electro_details order by ram",nativeQuery = true)
	List<Laptop> getRam();

	@Query(value = "Select * from electro_details order by price desc",nativeQuery = true)
	List<Laptop> getPrice();

	@Query(value = "Select count(1) from electro_details where brand Like?",nativeQuery = true)
	int getCount(String f);
	

}
