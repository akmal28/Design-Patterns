package Cloning;

public class Address implements Cloneable{
    public String streetName;
    public int road;

    public Address(String streetName, int road) {
        this.streetName = streetName;
        this.road = road;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(streetName, road);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", road=" + road +
                '}';
    }
}
