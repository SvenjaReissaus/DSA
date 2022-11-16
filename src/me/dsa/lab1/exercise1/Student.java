package me.dsa.lab1.exercise1;

public class Student {
    public Student() {
        this("", 0, 0);
    }

    public Student(final String name, final int semester, final double average) {
        this.name = name;
        this.semester = semester;
        this.average = average;
    }

    private String name;
    private int semester;
    private double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
