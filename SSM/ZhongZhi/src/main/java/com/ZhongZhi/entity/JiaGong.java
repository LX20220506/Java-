package com.ZhongZhi.entity;

public class JiaGong {
    private Integer jgId;

    private String ycName;

    private String ycState;

    private String ycNextStep;

    private String ycRepository;

    public Integer getJgId() {
        return jgId;
    }

    public void setJgId(Integer jgId) {
        this.jgId = jgId;
    }

    public String getYcName() {
        return ycName;
    }

    public void setYcName(String ycName) {
        this.ycName = ycName == null ? null : ycName.trim();
    }

    public String getYcState() {
        return ycState;
    }

    public void setYcState(String ycState) {
        this.ycState = ycState == null ? null : ycState.trim();
    }

    public String getYcNextStep() {
        return ycNextStep;
    }

    public void setYcNextStep(String ycNextStep) {
        this.ycNextStep = ycNextStep == null ? null : ycNextStep.trim();
    }

    public String getYcRepository() {
        return ycRepository;
    }

    public void setYcRepository(String ycRepository) {
        this.ycRepository = ycRepository == null ? null : ycRepository.trim();
    }
}