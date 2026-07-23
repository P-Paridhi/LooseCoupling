package com.paridhi.SpringJpa.Hibernate;

import com.paridhi.SpringJpa.Hibernate.entities.Product;
import com.paridhi.SpringJpa.Hibernate.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class HibernateApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository(){
		Product product = Product.builder()
				.sku("nestle")
				.title("Choco")
				.price(BigDecimal.valueOf(123.00))
				.quantity(12)
				.build();
		Product savedProduct = productRepository.save(product);
		System.out.println(savedProduct);

	}

	@Test
	void getRepository(){
		List<Product> entities = productRepository.findAll();
		System.out.println(entities);
	}

	@Test
	void getProductTitle(){
		List<Product> entities = productRepository.findByTitle("Choco");
		System.out.println(entities);
	}
}
