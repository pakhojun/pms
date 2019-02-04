package com.gxj.pojo;

import java.util.Date;

public class PoliticalStatus {

    /*`id` int(11) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varc*/

    private int id;
    private String name;
    private Date updateTime;
    private String remark;


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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
