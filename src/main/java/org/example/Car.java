package org.example;

public class Car extends Vehicle{

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    //getter&setter
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    //honk
    public void honk(){
        System.out.println("Honk, honk!");
    }

    //displayInfo
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}
