package com.copra.basics;

public class PlayWithInheritance extends Swift {

    String carName = "Swift";
    String modelName = "Vxi";
    String color = "white";

    public void getModelDetails() {
        System.out.println("Name of Car = " + carName);
        System.out.println("Model name = " + modelName);
        System.out.println("Color of model = " + color);
    }

    public static void main(String[] args) {
        Swift newSwift = new Swift();
        newSwift.getCarDetails();
      //newSwift.getModelDetails(); error due to Swift is base class and doesn't have its own child property

        System.out.println();

        PlayWithInheritance playWithInheritance = new PlayWithInheritance();
        playWithInheritance.getCarDetails();
        playWithInheritance.getModelDetails();
    }

}

class Swift {
    String nameOfCompany = "Suzuki";
    boolean isACAvail = true;
    int numberOfTyre = 4;

    public void getCarDetails() {
        System.out.println("Company name of Car = " + nameOfCompany);
        System.out.println("Is AC available in car = " + isACAvail);
        System.out.println("Number tyres in Car = " + numberOfTyre);
    }
}