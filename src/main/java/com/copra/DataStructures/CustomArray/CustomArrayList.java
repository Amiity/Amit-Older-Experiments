package com.copra.DataStructures.CustomArray;

import java.util.ArrayList;

public class CustomArrayList {

    private int capacity;
    private int size;
    private Object[] arr;

    public CustomArrayList() {
        capacity = 10;
        size = 0;
        arr = new Object[capacity];
    }

    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        arr = new Object[capacity];
    }

    //Insert elements into array
    public void add(Object item) {
        if (size == capacity) {
            increaseCapacity();
        }
        arr[size] = item;
        size++;
    }


    //increase capacity..
    private void increaseCapacity() {
        System.out.println("capacity increases by 100%");
        this.capacity = capacity * 2;
        Object[] newArr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    //Get size of Array
    public int size() {
        return size;
    }

    //Is array empty
    public boolean isEmpty() {
        return size == 0;
    }

    //Get elements using index
    public Object get(int index) {
        return arr[index];
    }


    public static void main(String[] args) {

        CustomArrayList arrayList = new CustomArrayList();

        arrayList.add("Hello");
        arrayList.add("Amit");
        arrayList.add(12);
        arrayList.add(23.00);

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.size());
    }
}
