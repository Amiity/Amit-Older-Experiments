package com.copra.basics;


public class CustomWrapperClass {
    private int value;

    public CustomWrapperClass(int value) {
        this.value = value;
    }

    public void add(int num) {
        value += num;
    }

    public void subtract(int num) {
        value -= num;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public static void main(String[] args) {
        CustomWrapperClass wrapper = new CustomWrapperClass(10);

        System.out.println("Initial Value: " + wrapper);

        wrapper.add(5);
        System.out.println("After Adding 5: " + wrapper);

        wrapper.subtract(3);
        System.out.println("After Subtracting 3: " + wrapper);
    }
}
