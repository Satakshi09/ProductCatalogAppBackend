package com.application.service;

import java.util.List;

import com.application.model.Product;

public interface ProductService {

	/**
	 * Add product to database
	 * 
	 * @param product
	 */
	public void addProduct(Product product);

	/**
	 * Update project
	 * 
	 * @param product
	 */
	public void updateProduct(Product product);

	/**
	 * Get list of products
	 * 
	 * @return
	 */
	public List<Product> getProduct();

	/**
	 * get list of product respect to input (productcode, productname, productbrand)
	 * 
	 * @param productCode
	 * @param productName
	 * @param productBrand
	 * @return
	 */
	public List<Product> getProduct(String productCode, String productName, String productBrand);

	/**
	 * Get product by product code
	 * 
	 * @param productCode
	 * @return
	 */
	public Product getProductByProductCode(String productCode);

}
