package com.ZhongZhi.entity;

public class JiaGeJianKong {
    private Integer ycjdId;

    private String ycName;

    private Integer ycAge;

    private Integer ycYjgPrice;

    private Integer ycWjgPrice;

    public Integer getYcjdId() {
        return ycjdId;
    }

    public void setYcjdId(Integer ycjdId) {
        this.ycjdId = ycjdId;
    }

    public String getYcName() {
        return ycName;
    }

    public void setYcName(String ycName) {
        this.ycName = ycName == null ? null : ycName.trim();
    }

    public Integer getYcAge() {
        return ycAge;
    }

    public void setYcAge(Integer ycAge) {
        this.ycAge = ycAge;
    }

    public Integer getYcYjgPrice() {
        return ycYjgPrice;
    }

    public void setYcYjgPrice(Integer ycYjgPrice) {
        this.ycYjgPrice = ycYjgPrice;
    }

    public Integer getYcWjgPrice() {
        return ycWjgPrice;
    }

    public void setYcWjgPrice(Integer ycWjgPrice) {
        this.ycWjgPrice = ycWjgPrice;
    }
}