package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void checkTriangle() {
        Point a = new Point(0, 6);
        Point b = new Point(6, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 18.00;
        double rsl = triangle.area();
        Assert.assertEquals(expected, rsl, 0.01);

    }
}