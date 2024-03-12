package com.example.demojunittesting;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public Point translater(double dx, double dy) {
        return new Point(this.getX() + dx, this.getY() + dy);
    }

    @Override
    public boolean equals(Object obj) {
        Point pt = (Point) obj;
        return Double.compare(pt.x, x) == 0 && Double.compare(pt.y, y) == 0;
    }
}
