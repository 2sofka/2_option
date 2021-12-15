package com.company;


public class Main extends Transporter{

    public static void main(String[] args) {
	// write your code here
        tr.add(new Train("Брест",0));
        tr.add(new Train("Гродно",500));
        tr.add(new Train("Минск",1000));
        ShowInfo(tr.get(1), tr.get(2));
    }
}
