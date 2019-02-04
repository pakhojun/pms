package com.gxj.pojo;

import java.util.Date;

public class Employee {
    /*
    * `id` int(11) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` varchar(32) DEFAULT NULL,
  `brithday` datetime DEFAULT NULL,
  `psid` int(11) DEFAULT NULL,
  `phone` varchar(256) DEFAULT NULL,
  `adress` varchar(256) DEFAULT NULL,
    * */

    private int id;
    private String name;
    private String sex;
    private Date brithday;
    private PoliticalStatus politicalStatus;
    private String phone;
    private String adress;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public PoliticalStatus getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(PoliticalStatus politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
