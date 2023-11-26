package com.copra.basics;


interface Greeting { //anonymous class purpose
    void greet();
}

public class InnerClassExperiment {

    static class StaticInnerClass { //static inner class
        void display() {
            System.out.println("static Inner Class");
        }
    }
    class NonStaticInnerClass { // non static inner class
        void display() {
            System.out.println("non static Inner Class");
        }
    }

    void display() {
        class LocalClass { // inner local class
            void print() {
                System.out.println("Local Class");
            }
        }
        LocalClass local = new LocalClass();
        local.print();
    }

    public static  void main(String [] args){

        //static Inner class invocation
        InnerClassExperiment.StaticInnerClass  staticInnerClass = new StaticInnerClass();
        staticInnerClass.display();


        //Non-static Inner class invocation
        InnerClassExperiment innerClassExperiment = new InnerClassExperiment();
        InnerClassExperiment.NonStaticInnerClass innerClass = innerClassExperiment.new NonStaticInnerClass();
        innerClass.display();

        //local class invocation
        InnerClassExperiment classExperiment = new InnerClassExperiment();
        classExperiment.display();

        //anonymous class using interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hey!! this is anonymous class");
            }
        };
        greeting.greet();
    }
}


