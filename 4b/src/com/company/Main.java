package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Payments.Client client = new Payments.Client(), client1 = new Payments.Client();
        Payments.Admin admin = new Payments.Admin();
        client.addMoney_on_credit_card(100);
        client.Show_credit_card();
        client.Give_Money_on_another_credit_card(50,client1);
        client.Pay(250);
        client.Show_credit_card();
        client.Show_bank_account();
        System.out.println("Пытаемся заблокировать карту за долги");
        admin.block_credit_card(client);
        client.Pay(450);
        client.Show_credit_card();

        client.terminate_bank_accaunt();
        client.Show_bank_account();

    }
}
