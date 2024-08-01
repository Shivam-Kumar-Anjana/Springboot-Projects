package com.shivam.jpaWeek3.JpaWeek3;

import com.shivam.jpaWeek3.JpaWeek3.entities.ProductEntity;
import com.shivam.jpaWeek3.JpaWeek3.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaWeek3ApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository(){
		ProductEntity productEntity = ProductEntity.builder()
				.sku("nestle234")
				.title("Nestle Chocolate")
				.price(BigDecimal.valueOf(23.45))
				.quantity(4)
				.build();

		ProductEntity savedProductEntity = productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}


	@Test
	void getRepository(){
	//	List<ProductEntity> entities = productRepository.findByCreatedAtAfter(LocalDateTime.of(2024, 1,1,0,0,0));
	//	List<ProductEntity> entities = productRepository.findByQuantityAndPrice(4, BigDecimal.valueOf(23.45));
	//	List<ProductEntity> entities = productRepository.findByQuantityGreaterThanAndPriceLessThan(4, BigDecimal.valueOf(23.45));
	//	List<ProductEntity> entities = productRepository.findByTitleLike("%Choc%");
		List<ProductEntity> entities = productRepository.findByTitleContainingIgnoreCase("Choc");
 		System.out.println(entities);
	}

	@Test
	void getSingleFromRepository(){
		Optional<ProductEntity> productEntity = productRepository
				.findByTitleAndPrice("Nestle Chocolate", BigDecimal.valueOf(23.45));
		productEntity.ifPresent(System.out::println);
	}

}
