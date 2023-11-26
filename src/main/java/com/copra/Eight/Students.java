package com.copra.Eight;

public class Students {

    private int id;
    private String name;
    private int age;
    private int rank;
    private String collegeName;
    private final static String universityName;

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

   static{

        universityName = "Washington University ";
   }

    public Students(int id, String name, int age, int rank, String collegeName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.collegeName = collegeName;
    }
}
