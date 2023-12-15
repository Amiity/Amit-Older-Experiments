package com.copra.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) {
        String fileName = "/Users/amy/Documents/demo.txt";

        try(FileInputStream inputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ){

           SerilizationDemo s = (SerilizationDemo) objectInputStream.readObject();
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getSchool());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
