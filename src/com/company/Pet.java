package com.company;

public class Pet {
    private String name = "Rosie";
    private int age = 1;
    private String location = "New Orleans";
    private String type = "Corgi";

    public Pet() {

    }
    public Pet (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Pet (String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
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
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public boolean isDog() {
        return true;
    }
    public String corgiLife() {
        return "My heart is bigger than my butt!";
    }





}
