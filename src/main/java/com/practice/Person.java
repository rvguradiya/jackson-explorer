package com.practice;

public class Person {
    private String name;
    private int age;

    public Person(){} // default constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: {name:"+this.name+", age:"+this.age+"}";
    }
}
