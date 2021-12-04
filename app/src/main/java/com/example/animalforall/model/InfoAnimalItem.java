package com.example.animalforall.model;

public class InfoAnimalItem {

    private String name;
    private String age;
    private String gender;
    private String adress;
    private String Story;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStory() {
        return Story;
    }

    public void setStory(String story) {
        Story = story;
    }

    public InfoAnimalItem(String name, String age, String gender, String adress, String story) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        Story = story;
    }
}
