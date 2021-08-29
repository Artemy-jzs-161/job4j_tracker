package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(String numOfPass);

    int tankUp(int fuelQuantity);

}
