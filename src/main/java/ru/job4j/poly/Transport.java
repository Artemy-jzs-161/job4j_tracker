package ru.job4j.poly;

public interface Transport {
    void run();

    String passengers(int numOfPass);

    String tankUp(int fuelQuantity);

}
