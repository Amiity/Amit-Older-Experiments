package com.copra.basics;

final class ImmutableStudent {

    private final int id;
    private final String name;

    Add add = new Add();

    ImmutableStudent(int id, String name, Add add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Add getAdd() throws CloneNotSupportedException {
        return (Add) add.clone();
    }

}

class Add implements Cloneable
{
    private String city;
    private String State;
    private int code;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public Object clone() throws CloneNotSupportedException {
         return super.clone();
    }


}


public class ImmutableClass {
    public static void main(String arg[]) throws CloneNotSupportedException {

        Add add = new Add();
        add.setCity("MUM");
        add.setCode(53112);
        add.setState("MH");


        ImmutableStudent is = new ImmutableStudent(2, "AMit", add);
        System.out.println(is.getId());
        System.out.println(is.getName());
        System.out.println(is.add.getCity());
        System.out.println(is.add.getCode());

        is.getAdd().setCode(2121);

        is.getAdd().setCode(2121);
        System.out.println(is.add.getCode());
        System.out.println(is.add.getState());

        System.out.println(".........");
        ImmutableStudent is2 = new ImmutableStudent(3, "Ankit", add);
        System.out.println(is2.getId());
        System.out.println(is2.getName());

    }
}