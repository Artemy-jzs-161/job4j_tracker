package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = sum(5);
        int minus = minus(4);
        int devided = calculator.devide(5);
        int multiplied = calculator.multiply(5);
        double sao = calculator.sumAllOperation(sum, minus, devided, multiplied);

        System.out.println(sao);
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

    private double sumAllOperation(int sum,
                                   int minus,
                                   int devide,
                                   int multiply) {
        return sum + minus + devide + multiply;
    }
}
