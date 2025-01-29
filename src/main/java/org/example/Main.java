package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "black", 1.1f, "gasoline");
        vehicle.displayInfo();
        System.out.println("\n");

        Car car = new Car(5, "white", 1.2f, "diesel", "Honda");
        vehicle.displayInfo();
        car.honk();
    }
}