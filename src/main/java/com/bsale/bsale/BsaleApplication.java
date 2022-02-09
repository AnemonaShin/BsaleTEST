package com.bsale.bsale;

import com.bsale.bsale.model.CategoryModel;
import com.bsale.bsale.repository.CategoryRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BsaleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BsaleApplication.class);
        CategoryRepository repository = context.getBean(CategoryRepository.class);

		Iterable<CategoryModel> all = repository.findAll();

		for (CategoryModel category: all){
			System.out.println("\t" + category);
		}

		context.close();
	}

}
