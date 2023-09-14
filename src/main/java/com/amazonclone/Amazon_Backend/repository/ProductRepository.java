package com.amazonclone.Amazon_Backend.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amazonclone.Amazon_Backend.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Page<Product> findByProductNameContainingIgnoreCase(String keyword, Pageable pageDetails);
 
	@Query("SELECT p FROM Product p WHERE p.size = ?1")
	List<Product> findBySize(String size);

}
