package com.sample.springmodulith;

import com.sample.springmodulith.product.internal.Product;
import com.sample.springmodulith.product.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringModulithApplication.class, args)
				.getBean(ProductService.class)
				.create(
						Product.builder()
								.name("IPHONE-15")
								.description("Latest Iphone")
								.price(90000)
								.build());


	}

}
