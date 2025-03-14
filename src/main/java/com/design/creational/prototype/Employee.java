package com.design.creational.prototype;

import lombok.Data;

@Data
public class Employee implements Prototype{
    private int id;
    private String name;
    private String company;

    public Employee(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    @Override
    public Prototype clone() {
        return new Employee(this.id,this.name,this.company);
    }
}
