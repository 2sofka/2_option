package com.company;

public class Main extends Customer{

    public static void main(String[] args)  {
	// write your code here
        Customer customer = new Customer();

        customer.SetName("Name");
        customer.SetNum_of_bankAccount(321);
        customer.SetNum_of_card(123);
        customer.SetSurname("Surname");
        customer.SetSecName("Secname");
        customer.SetAddress("Address");
        customer.ShowInfo();
    }
}
