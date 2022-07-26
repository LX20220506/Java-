package com.ZhongZhi.entity;

public class DiKuai {
    private Integer dkid;

    private String dkName;

    private Integer dkUid;

    private Integer dkWendu;

    private Integer dkShidu;

    private Integer dkPh;

    private Integer dkDan;

    private Integer dkLin;

    private Integer dkXin;

    private Integer dkMianji;

    private Integer dkNianxian;

    // 设置多对一关系
    private User user;

    public Integer getDkid() {
        return dkid;
    }

    public void setDkid(Integer dkid) {
        this.dkid = dkid;
    }

    public String getDkName() {
        return dkName;
    }

    public void setDkName(String dkName) {
        this.dkName = dkName == null ? null : dkName.trim();
    }

    public Integer getDkUid() {
        return dkUid;
    }

    public void setDkUid(Integer dkUid) {
        this.dkUid = dkUid;
    }

    public Integer getDkWendu() {
        return dkWendu;
    }

    public void setDkWendu(Integer dkWendu) {
        this.dkWendu = dkWendu;
    }

    public Integer getDkShidu() {
        return dkShidu;
    }

    public void setDkShidu(Integer dkShidu) {
        this.dkShidu = dkShidu;
    }

    public Integer getDkPh() {
        return dkPh;
    }

    public void setDkPh(Integer dkPh) {
        this.dkPh = dkPh;
    }

    public Integer getDkDan() {
        return dkDan;
    }

    public void setDkDan(Integer dkDan) {
        this.dkDan = dkDan;
    }

    public Integer getDkLin() {
        return dkLin;
    }

    public void setDkLin(Integer dkLin) {
        this.dkLin = dkLin;
    }

    public Integer getDkXin() {
        return dkXin;
    }

    public void setDkXin(Integer dkXin) {
        this.dkXin = dkXin;
    }

    public Integer getDkMianji() {
        return dkMianji;
    }

    public void setDkMianji(Integer dkMianji) {
        this.dkMianji = dkMianji;
    }

    public Integer getDkNianxian() {
        return dkNianxian;
    }

    public void setDkNianxian(Integer dkNianxian) {
        this.dkNianxian = dkNianxian;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}