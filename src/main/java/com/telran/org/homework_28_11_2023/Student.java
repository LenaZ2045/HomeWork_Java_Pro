package com.telran.org.homework_28_11_2023;

public class Student { // parent class

    private final String name;
    private final double rate;
    private final boolean finished;
    private ClassType type;

    public Student(String name, double rate, boolean finished, ClassType type) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public ClassType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", finished=" + finished +
                ", type=" + type +
                '}';
    }
}