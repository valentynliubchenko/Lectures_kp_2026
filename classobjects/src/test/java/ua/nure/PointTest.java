package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void runExample() {
        Point p = Point.getPoint(1, 20);
        System.out.println(p);
        System.out.println(p.hashCode());
        p = Point.getPoint(10, 20);
        System.out.println(p);
        System.out.println(p.hashCode());
    }


    @Test
    void constructorTest() {
        Point p = new Point(1, 2);
        assertEquals(1, p.x());
        assertEquals(2, p.y());
        System.out.println(p.x());
        System.out.println(p.y());
    }

    @Test
    void restrictionExampleTest() {
        Point p = new Point(123, 53);
        System.out.println(p.x());
        System.out.println(p.y());
        assertEquals(100, p.x());
        assertEquals(50, p.y());

    }

    @Test
    void distanceTest() {
        Point p1 = new Point(0, 0);
        Point p2 = Point.getPoint(0, 5);
        System.out.println(Point.distance(p1, p2));
        assertEquals(5, Point.distance(p1, p2));

    }
}