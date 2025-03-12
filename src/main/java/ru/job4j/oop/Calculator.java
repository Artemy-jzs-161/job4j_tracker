package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(sum(5));
        System.out.println(minus(5));
        System.out.println(calculator.devide(5));
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.sumAllOperation(5));

    }

    private static int sum(int y) {
        return x + y;
    }

    private static int minus(int y) {
        return y - x;
    }

    private int devide(int y) {
        return y / x;
    }

    private int multiply(int y) {
        return x * y;
    }

    private double sumAllOperation(int y) {
        return sum(y)
                + minus(y)
                + devide(y)
                + multiply(y);
    }
}
