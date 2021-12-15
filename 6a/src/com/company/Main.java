package com.company;

public class Main extends Payment{

    public static void main(String[] args) {
	// write your code here
        getProducts(new Product[]{new Product(10, "еда"), new Product(12, "еда"), new Product(5, "еда")});
        ShowProducts();
    }
}
