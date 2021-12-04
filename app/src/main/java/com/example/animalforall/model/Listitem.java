package com.example.animalforall.model;

public class Listitem {

    private String title;
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Listitem(String title, String desp) {
        this.title = title;
        this.desc = desp;
    }


}
