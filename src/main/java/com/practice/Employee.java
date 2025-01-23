package com.practice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * this class use addiction property
 * @JsonProperty: Customize property names in JSON.
 * @JsonIgnore: Exclude fields from JSON serialization/deserialization.
 * @JsonInclude: Specify inclusion criteria for properties.
 */

public class Employee {
    @JsonProperty("full_name")
    private String name;

    private int age;

    @JsonIgnore
    private  String password;

    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    public Employee(){}

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee: {name:"+this.name+", age:"+this.age+", password:"+this.password+"}";
    }
}
