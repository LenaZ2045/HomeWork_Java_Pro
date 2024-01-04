package com.telran.org.homework_28_11_2023;

public class ProjectStudent {

    private String name;
    private double rate;
    private ClassType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public void setFinished(boolean finished) {
    }

    @Override
    public String toString() {
        return "ProjectStudent{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type=" + type +
                '}';
    }
}
