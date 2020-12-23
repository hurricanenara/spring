package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    // Basic Constructor
    public Tutor() {

    }

    // Constructor
    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getBio() {
        return this.bio;
    }
}
