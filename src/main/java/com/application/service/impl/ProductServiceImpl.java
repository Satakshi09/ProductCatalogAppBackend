package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.exception.UserAlreadyPresentException;
import com.application.model.Product;
import com.application.repository.ProductRepository;
import com.application.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		if (productRepository.findByProductCode(product.getProductCode()) == null) {

			productRepository.save(product);
		} else {
			throw new UserAlreadyPresentException("Product", "ProductCode already present : ",
					product.getProductCode());
		}
	}

	@Override
	public List<Product> getProduct() {
		return productRepository.findAll();

	}

	@Override
	public List<Product> getProduct(String productCode, String productName, String productBrand) {
		return productRepository.findProductByInputParameter(productCode, productName, productBrand);
	}

	@Override
	public Product getProductByProductCode(String productCode) {
		return productRepository.findByProductCode(productCode);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);

	}

}
