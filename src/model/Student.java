package model;

public class Student {
    public static int count;
    private int id;
    private String name;
    private int age;
    private int dateofbirth;
    private String address;

    Student(String newName) {
        name = newName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDateofbirth() {
        return dateofbirth;
    }

    public String getAddress() {
        return address;
    }
}
