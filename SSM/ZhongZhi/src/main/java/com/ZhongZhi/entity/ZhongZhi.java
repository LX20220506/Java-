package com.ZhongZhi.entity;

public class ZhongZhi {
    private Integer zid;

    private String zzName;

    private Integer dkid;

    private String zuoWu;

    private String huanJin;

    private String shiJian;

    private String mianJi;

    private String yuJiJinE;

    private String uid;

    private String beiZhu;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZzName() {
        return zzName;
    }

    public void setZzName(String zzName) {
        this.zzName = zzName == null ? null : zzName.trim();
    }

    public Integer getDkid() {
        return dkid;
    }

    public void setDkid(Integer dkid) {
        this.dkid = dkid;
    }

    public String getZuoWu() {
        return zuoWu;
    }

    public void setZuoWu(String zuoWu) {
        this.zuoWu = zuoWu == null ? null : zuoWu.trim();
    }

    public String getHuanJin() {
        return huanJin;
    }

    public void setHuanJin(String huanJin) {
        this.huanJin = huanJin == null ? null : huanJin.trim();
    }

    public String getShiJian() {
        return shiJian;
    }

    public void setShiJian(String shiJian) {
        this.shiJian = shiJian == null ? null : shiJian.trim();
    }

    public String getMianJi() {
        return mianJi;
    }

    public void setMianJi(String mianJi) {
        this.mianJi = mianJi == null ? null : mianJi.trim();
    }

    public String getYuJiJinE() {
        return yuJiJinE;
    }

    public void setYuJiJinE(String yuJiJinE) {
        this.yuJiJinE = yuJiJinE == null ? null : yuJiJinE.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }
}