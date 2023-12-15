package com.copra.deisgnPattern;

public class FactoryDesignPattern {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("Car");
        car.start();
        car.stop();

        Vehicle motorcycle = factory.createVehicle("Motorcycle");
        motorcycle.start();
        motorcycle.stop();


    }

}


class VehicleFactory {
    public Vehicle createVehicle(String arg) {
        if (arg.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (arg.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        } else {
            return null;
        }
    }
}

interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

