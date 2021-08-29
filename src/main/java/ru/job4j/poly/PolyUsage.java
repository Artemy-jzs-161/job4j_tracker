package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle air1 = new Airplane();
        Vehicle air2 = new Airplane();

        Vehicle train1 = new Train();
        Vehicle train2 = new Train();

        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();

        Vehicle[] vehicles = new Vehicle[]{air1, air2, train1, train2, bus1, bus2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
