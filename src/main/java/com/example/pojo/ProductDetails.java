package com.example.pojo;

public class ProductDetails {

	private int productId;

	private String brand;

	private int price;

	private int yearOfManufacturing;

	private Category categoryId;

	private Category subCategoryId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Category getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Category subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", brand=" + brand + ", price=" + price
				+ ", yearOfManufacturing=" + yearOfManufacturing + ", categoryId=" + categoryId + ", subCategoryId="
				+ subCategoryId + "]";
	}

}
