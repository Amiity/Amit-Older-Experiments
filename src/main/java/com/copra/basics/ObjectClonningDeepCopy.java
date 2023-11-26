package com.copra.basics;

public class ObjectClonningDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        Students s1 = new Students();
        s1.address.city = "KNP";
        s1.address.pinCode = 21912;
        s1.rollNo = 23;
        s1.name = "Amit";

        Students s2 = (Students) s1.clone();
        // clone address too...
        s2.address = (Addresss) s1.address.clone();
        
        
        s2.address.city = "LKO";
        s2.address.pinCode = 35321;
        s2.rollNo = 25;
        s2.name = "Alok";
        
        

        System.out.println("Is both object are same in heap memory:" + (s1 == s2));
        System.out.println("Is both Address object are same in heap memory:"+(s1.address == s2.address));

        // calling s1
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.address.city);
        System.out.println(s1.address.pinCode);

        //calling s2
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.address.city);
        System.out.println(s2.address.pinCode);

    }

}

class Students implements Cloneable {
    int rollNo;
    String name;


    Addresss address = new Addresss();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Addresss implements  Cloneable{

    int pinCode;
    String city;
    Addresss()
    {    }
    Addresss(int pinCode, String city)
    {
        this.pinCode = pinCode;
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}