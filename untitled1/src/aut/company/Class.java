package aut.company;

public class Class {
    private String nameOfTecher;
    private String fullTime;
    private String offTime;
    private Student[] students;
    Teacher teacher;

    public Class(String name, String fullTime, String offTime) {
        this.fullTime = fullTime;
        this.nameOfTecher = name;
        this.offTime = offTime;
    }


    public String getFullTime() {
        return fullTime;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }

    public String getOffTime() {
        return offTime;
    }

    public void setOffTime(String offTime) {
        this.offTime = offTime;
    }

    public boolean notFull(String time) {
        if (this.fullTime == time) {
            return false;
        }
        return true;

    }

    public String getNameOfTecher() {
        return nameOfTecher;
    }

    public void setNameOfTecher(String nameOfTecher) {
        this.nameOfTecher = nameOfTecher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}