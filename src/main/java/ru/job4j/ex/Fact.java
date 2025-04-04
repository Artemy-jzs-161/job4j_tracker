package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(10));
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}