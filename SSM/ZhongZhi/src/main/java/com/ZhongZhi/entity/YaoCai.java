package com.ZhongZhi.entity;

import java.util.Date;

public class YaoCai {
    private Integer yid;

    private String ycName;

    private Date riQi;

    private String shengZhangQingKuang;

    private Integer dkid;

    private Integer mianJi;

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getYcName() {
        return ycName;
    }

    public void setYcName(String ycName) {
        this.ycName = ycName == null ? null : ycName.trim();
    }

    public Date getRiQi() {
        return riQi;
    }

    public void setRiQi(Date riQi) {
        this.riQi = riQi;
    }

    public String getShengZhangQingKuang() {
        return shengZhangQingKuang;
    }

    public void setShengZhangQingKuang(String shengZhangQingKuang) {
        this.shengZhangQingKuang = shengZhangQingKuang == null ? null : shengZhangQingKuang.trim();
    }

    public Integer getDkid() {
        return dkid;
    }

    public void setDkid(Integer dkid) {
        this.dkid = dkid;
    }

    public Integer getMianJi() {
        return mianJi;
    }

    public void setMianJi(Integer mianJi) {
        this.mianJi = mianJi;
    }
}