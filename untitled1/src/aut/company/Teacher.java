package aut.company;

public class Teacher {
    private String name;
    private String time;
    private String[] course;
    private String degree;

    public Teacher(String name, String time, String[] course) {
        this.course = course;
        this.name = name;
        this.time = time;

    }
    public void toStrings(){
        String string=" course: "+this.course[0]+","+ this.course[1]+" time: "+this.time +" degree: "+this.degree;
        System.out.println(string);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }



    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }
}
