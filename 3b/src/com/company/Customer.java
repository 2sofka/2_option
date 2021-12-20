package com.company;

public class Customer {

    private String Name;
    private String Surname;
    private String SecName;
    private String Address;
    private int Num_of_card;
    private int Num_of_bankAccount;

    public void SetAddress(String Address) {
        this.Address = Address;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void SetSurname(String Surname) {
        this.Surname = Surname;
    }

    public void SetSecName(String SecName) {
        this.SecName = SecName;
    }

    public void SetNum_of_card(int num) {
        this.Num_of_card = num;
    }

    public void SetNum_of_bankAccount(int num) {
        this.Num_of_bankAccount = num;
    }

    public String GetName() {
        return Name;
    }

    public String GetSurname() {
        return Surname;
    }

    public String GetSecName() {
        return SecName;
    }

    public int GetNum_of_bankAccount() {
        return Num_of_bankAccount;
    }

    public int GetNum_of_card() {
        return Num_of_card;
    }

    public void ShowInfo() {
        System.out.println(Name + " " + SecName + " " + Surname + "\n" + Address);
    }
}