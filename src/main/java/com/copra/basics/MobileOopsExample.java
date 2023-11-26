package com.copra.basics;

public class MobileOopsExample {

    String brand;
    String model;
    int size;

    public void printMobileDetail() {
        System.out.println("brand :" + brand);
        System.out.println("model :" + model);
        System.out.println("size :" + size);
    }


    public static void main(String[] args) {

        MobileOopsExample m1 = new MobileOopsExample();
        m1.brand = "apple";
        m1.model = "6s";
        m1.size = 4;
        m1.printMobileDetail();
        System.out.println(" ");

        MobileOopsExample m2 = new MobileOopsExample();
        m2.brand = "apple";
        m2.model = "6s";
        m2.size = 4;
        m2.printMobileDetail();
    }

}


