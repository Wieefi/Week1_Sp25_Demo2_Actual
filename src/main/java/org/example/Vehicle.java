package org.example;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    //construc
    public Vehicle (int numberOfWheels, String color, float engineSize, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;

    }

    //getter&setter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public float getEngineSize(){
        return engineSize;
    }
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }
    public String getFuelType(){
        return getFuelType();
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    //displayInfo printing
    public void displayInfo(){
        System.out.println("Vehicle Info: ");
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }




}
