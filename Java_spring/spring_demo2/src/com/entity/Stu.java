package com.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    private String[] cname;
    private List list;
    private Map map;
    private Set set;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCname(String[] cname) {
        this.cname = cname;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "cname=" + Arrays.toString(cname) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }
}
