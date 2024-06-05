package javaDevM01_assignment4;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular Polygon 1");
        System.out.println("Perimeter: " + rp1.getPerimeter());
        System.out.println("Area: " + rp1.getArea());
        System.out.println();

        System.out.println("Regular Polygon 2");
        System.out.println("Perimeter: " + rp2.getPerimeter());
        System.out.println("Area: " + rp2.getArea());
        System.out.println();

        System.out.println("Regular Polygon 3");
        System.out.println("Perimeter: " + rp3.getPerimeter());
        System.out.println("Area: " + rp3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // no-arg constructor
    public RegularPolygon() {}

    // constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // constructor with specified number of sides, length of side, and x and y coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // accessor methods
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // mutator methods
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // method to return the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // method to return the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}


