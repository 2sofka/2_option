package com.company;

import java.util.ArrayList;

public class Payments {
    private static int debt  = -300;



    static public class Client {

        ArrayList<Integer> bank_accaunt = new ArrayList<>();
        int credit_card = 0;
        boolean canPay = true;
        public Client() {}

        public void Show_bank_account(){System.out.println("Банковские операции: "+bank_accaunt);}
        public void Show_credit_card(){
            if(canPay)
                if(this.credit_card >= 0)
                    System.out.println("На балансе: "+credit_card);
                else
                    System.out.println("На балансе: "+credit_card + "\n" + "Пожалуйста, пополните баланс");
            else System.out.println("Карта заблокирована");
        }

    public void addMoney_on_credit_card(int Money)
        {
            if(canPay){
            this.credit_card+=Money;
            this.bank_accaunt.add(Money);
            }
            else System.out.println("Карта заблокирована");
        }


        public void Pay(int Cost)
        {
            if(canPay) {
                if (canPay(Cost)) {
                    this.bank_accaunt.add(-Cost);
                    this.credit_card -= Cost;
                } else
                    System.out.println("Недостаточно денег на балансе");
            }
            else System.out.println("Карта заблокирована");
        }

        public void Give_Money_on_another_credit_card(int Money, Client client){

            if(canPay(Money) & canPay)
            {
                client.addMoney_on_credit_card(Money);
                this.credit_card-=Money;
                this.bank_accaunt.add(-Money);
            }
            else
                System.out.println("Карта заблокирована");

        }

        public boolean canPay(int Cost)
        {
                return true;
         }

        public void block_credit_card(){ this.credit_card = 0;}
        public void terminate_bank_accaunt(){this.bank_accaunt = new ArrayList<>();}

    }

    static public class Admin {
        public Admin(){}
        public void block_credit_card(Client client){
            if (client.credit_card < debt)
                client.canPay = false;
            else
                System.out.println("На балансе недостаточный долг для блокировки");

        }
    }


}
