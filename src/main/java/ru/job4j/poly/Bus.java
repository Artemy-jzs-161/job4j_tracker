package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    private String passenger;
    private int price;

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void passengers(String numOfPass) {
        this.passenger = numOfPass;
    }

    @Override
    public int tankUp(int fuelQuantity) {
        return fuelQuantity * price;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " move");

    }
}
