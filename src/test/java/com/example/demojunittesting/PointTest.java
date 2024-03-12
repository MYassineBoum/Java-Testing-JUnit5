package com.example.demojunittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    Point expected;
    Point obtained;
    public void commonInit(double xe, double ye, double xt, double yt) {
        Point a = new Point(1, 2);
        expected = new Point(xe, ye);
        obtained = a.translater(xt, yt);
    }

    @Test
    public final void testTranslater0_0() {
        // Point a = new Point(1, 2);
        // Point expected = new Point(1, 2);
        // Point obtained = a.translater(0, 0);
        commonInit(1, 2, 0
                , 0);
        assertEquals(expected, obtained); // Address comparison
    }

    @Test
    public final void testTranslater1_3() {
        // Point a = new Point(1, 2);
        // Point expected = new Point(2, 5);
        // Point obtained = a.translater(1, 3);
        commonInit(2, 5, 1, 3);
        assertEquals(expected, obtained);
    }


}
