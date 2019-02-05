package com.gxj.pojo;

import java.util.Date;

/**
 * 岗位信息
 */
public class PositionsInfo {

    /*`id` int(11) NOT NULL,
  `depid` int(11) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `content` text,
  `salary` decimal(10,2) DEFAULT NULL,
  `allowance` decimal(10,2) DEFAULT NULL,
  `perquisites` decimal(10,2) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,*/

    private int id;
    private Department department;
    private String name;
    private String content;
    private double salary;
    private double allowance;
    private double perquisites;
    private String remark;
    private Date updateTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getPerquisites() {
        return perquisites;
    }

    public void setPerquisites(double perquisites) {
        this.perquisites = perquisites;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
