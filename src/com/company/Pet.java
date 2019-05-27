package com.company;

import java.util.Random;

public class Pet {
    int age;
    Color color;
    Shelter shelter;


    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return new Random().nextInt(100);
}
    public String getInfo() {
        return "Pet {" + "возраст:" + ",приют:" + shelter.getName() + " " + shelter.getAddress() + "цвет:" +
                color + "}";


    }
}
