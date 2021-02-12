package com.microservices.student.catalog.models;

public class CatalogItem {
    private String name;
    private String desc;
    private int marks;

    public CatalogItem(String name, String desc, int marks) {
        this.name = name;
        this.desc = desc;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMarks() {
        return marks;
    }

    public void settMarks(int marks) {
        this.marks = marks;
    }
}