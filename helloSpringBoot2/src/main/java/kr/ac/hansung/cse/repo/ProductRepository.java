package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByCategory(String category);
	List<Product> findByPrice(int price);
	List<Product> findByManufacturer(String manufacturer);
	List<Product> findByUnitInStock(int unitInStock);
	List<Product> findByDescription(String description);
}