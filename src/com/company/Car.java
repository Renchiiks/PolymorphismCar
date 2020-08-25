package com.company;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int doors;
    private String color;

    public Car(String name, boolean engine, int cylinders, int doors, String color) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.doors = doors;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String startEngine() {
       return "Car engine is working";
    }

    public String accelerate(int speed) {
        return "Car is driving at " + speed + "km pre hour";
    }

    public String brake() {
       return "Car is stopped";
    }
}
