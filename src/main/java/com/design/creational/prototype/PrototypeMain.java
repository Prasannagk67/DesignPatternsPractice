package com.design.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args){
        Employee prototypeEmployee = new Employee(1,"Prasanna","HCL");
        Employee employee = (Employee) prototypeEmployee.clone();
        employee.setId(2);
        employee.setName("Charan");
        employee.setCompany("IMSS");
        Employee employee1 = (Employee) prototypeEmployee.clone();
        employee1.setId(3);
        employee1.setName("NTR");
        employee1.setCompany("Virtusa");
        System.out.println(prototypeEmployee);
        System.out.println(employee);
        System.out.println(employee1);
    }
}
