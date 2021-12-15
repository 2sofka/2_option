package com.company;
import java.util.ArrayList;

public class Transporter {

    static ArrayList<Train> tr = new ArrayList<>();
    static ArrayList<Plane> pl = new ArrayList<>();
    static ArrayList<Car> cr = new ArrayList<>();

    public static void ShowInfo(Train tr1, Train tr2) {
        if(tr1.getCost() > tr2.getCost())
            System.out.println("Время поездки: " + (tr1.getTime() - tr2.getTime()) + "\n" + "Стоимость поездки: " + (tr1.getCost() - tr2.getCost()));
        else
            System.out.println("Время поездки: " + (tr2.getTime() - tr1.getTime()) + "\n" + "Стоимость поездки: " + (tr2.getCost() - tr1.getCost()));
    }

    public static void ShowInfo(Plane pl1, Plane pl2) {
        if(pl1.getCost() > pl2.getCost())
            System.out.println("Время поездки: " + (pl1.getTime() - pl2.getTime()) + "\n" + "Стоимость поездки: " + (pl1.getCost() - pl2.getCost()));
        else
            System.out.println("Время поездки: " + (pl2.getTime() - pl1.getTime()) + "\n" + "Стоимость поездки: " + (pl2.getCost() - pl1.getCost()));
    }

    public static void ShowInfo(Car cr1, Car cr2) {
        if(cr1.getCost() > cr2.getCost())
            System.out.println("Время поездки: " + (cr1.getTime() - cr2.getTime()) + "\n" + "Стоимость поездки: " + (cr1.getCost() - cr2.getCost()));
        else
            System.out.println("Время поездки: " + (cr2.getTime() - cr1.getTime()) + "\n" + "Стоимость поездки: " + (cr2.getCost() - cr1.getCost()));
    }


    public static class Train{

        double cost;
        double time;
        String City;
        int Range;
        double n = 3;
        public Train(String City, int Range){
            cost = Range*n;
            time = Range/n;
            this.Range = Range;
            this.City = City;
        }

        public double getCost() {
            return cost;
        }
        public double getTime() {
            return time;
        }

    }

    public static class Car{

        double cost;
        double time;
        double n = 1;
        String City;
        int Range;
        public Car(String City, int Range){
            cost = Range*n;
            time = Range/n;
            this.Range = Range;
            this.City = City;
        };

        public double getCost() {
            return cost;
        }
        public double getTime() {
            return time;
        }
    }

    public static class Plane{

        double cost;
        double time;
        double n = 5;
        String City;
        int Range;
        public Plane(String City, int Range){
            cost = Range*n;
            time = Range/n;
            this.Range = Range;
            this.City = City;
        };

        public double getCost() {
            return cost;
        }
        public double getTime() {
            return time;
        }
    }


}
