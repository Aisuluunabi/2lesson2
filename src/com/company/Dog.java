package com.company;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(String бим, String овчарка, Color GRAY, Shelter shelter, String[] commands) {
    }

    public Dog(String рекс, String хаски, Color white, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        setColor(color);
        setShelter(this.shelter);
    }

    public Dog(String name,String breed,String color, Shelter shetler, String [] commands ) {
        this.name = name;
        this.breed = breed;
        this.shelter = shetler;
        this.commands = commands
        ;
    }

    public void makeVoice(){
        System.out.println("Гав-Гав");
    }

    public void makeVoice(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Гав - гав");
        }
        System.out.println();
    }

    public void makeVoice(String voice, int number){
            for (int i = 0; i < number ; i++) {
                System.out.println(voice + " ");
            }
            System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return "Dog{" +
                "кличк=" + name + ",порода=" + breed + ", команда=" + Arrays.toString(commands)+ "}" + super.getInfo();
   }
}

