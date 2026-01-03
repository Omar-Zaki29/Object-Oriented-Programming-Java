package carsproject;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Sedan", 2006, 3);
        Car c2 = new Car("Toyota", "Sedan", 2006, 3);
        System.out.println(c1.equals(c2));
    }
}
