package com.telran.org.homework_28_11_2023;

public class BackEndStudent extends Student { // inheritor class

    private ClassType type;

    public BackEndStudent(String name, double rate, boolean finished, ClassType type) {
        super(name, rate, finished, type);
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = ClassType.BA;
    }
}