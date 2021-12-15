package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Payment {

    static public ArrayList<Product> list_of_purchases = new ArrayList();

    public static void getProducts(Product[] product) {
        for(int i = 0; i < product.length; i++)
            list_of_purchases.add(product[i]);
    }
    public static void ShowProducts(){
        for(int i = 0; i < list_of_purchases.size();i++)
            System.out.println(list_of_purchases.get(i).Name + " стоимостью " + list_of_purchases.get(i).Cost);
    }

    public static class Product{
        int Cost;
        String Name;
        public  Product(int Cost, String Name){
            this.Cost = Cost;
            this.Name = Name;
        }
    }
}
