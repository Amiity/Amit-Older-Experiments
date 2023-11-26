package com.copra.basics;

class Animal {

    int a;
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void place(){
        System.out.println("Anywhere");
    }
}

class Dog extends Animal {

    int b;
    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

    void breed(){
        System.out.println("Husky");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal myPet = new Dog(); // Polymorphic reference
        myPet.sound(); // Calls the Dog class's overridden method
        myPet.place();
        //mypet.breed(); // Not able to call Dog method

        Dog myPet3 = new Dog(); // Polymorphic reference
        myPet3.sound(); // Calls the Dog class's overridden method
        myPet3.place();
        myPet3.breed();

        Animal myPet2 = new Animal();
        myPet2.sound();
        myPet2.place();
     //   mypet2.breed();  // Not able to call Dog method

        // The reverse is not possible:
        // Dog myDog = new Animal(); // This will result in a compilation error
    }
}

