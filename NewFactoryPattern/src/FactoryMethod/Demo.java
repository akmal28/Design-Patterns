package FactoryMethod;

public class Demo {
    public static void main(String[] args) {
        Point cartesian = Point.Factory.newCartesianPoint(2, 3);
        Point polar = Point.Factory.newPolarPoint(2.14, 180);
        System.out.println(cartesian);
        System.out.println(polar);
    }
}
