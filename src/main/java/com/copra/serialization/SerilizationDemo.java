package com.copra.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
public class SerilizationDemo implements Serializable {

    private int id;
    private String name;
    transient private String school;

}

class App {

    public static void main(String[] args) {

        SerilizationDemo serilizationDemo = new SerilizationDemo();
        serilizationDemo.setId(3);
        serilizationDemo.setName("Amit");
        serilizationDemo.setName("ofic");

        String fileName = "/Users/amy/Documents/demo.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(serilizationDemo);

            System.out.println("Object saved into file...");

        } catch (IOException e) {
            System.out.println("Exception occured ...");
            e.printStackTrace();

        }

    }
}


