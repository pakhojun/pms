package com.gxj.pojo;

import java.util.List;

public class Department {

    /*
    *`id` int(11) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `leaderid` int(11) DEFAULT NULL,
    * */

    private int id;
    private String name;
    private Employee employee;


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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
