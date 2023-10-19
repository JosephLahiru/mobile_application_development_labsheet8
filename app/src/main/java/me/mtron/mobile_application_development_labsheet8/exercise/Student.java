package me.mtron.mobile_application_development_labsheet8.exercise;

public class Student {
    private int id;
    private String name;
    private String age;
    private String address;
    private String department;

    public Student(int id, String name, String age, String address, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }

    public Student(String name, String age, String address, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
