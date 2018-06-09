package aut.company.hw6;

public class UndergraduateStudent extends Student {
    private int AllCourses = 140;

    private String quota;

    public UndergraduateStudent(String quota) {
        this("","",0,quota);

    }

    public UndergraduateStudent(String firstName, String lastName, int id, String quota) {
        super(firstName, lastName, id);
        this.quota = quota;
    }

    public void UndergraduateStudentInformation() {
        System.out.println("UndergraduateStudent{" +
                "AllCourses=" + AllCourses +
                ", quota='" + quota + '\'' +
                '}');
    }

    public int getAllCourses() {
        return AllCourses;
    }


    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{" +
                "AllCourses=" + AllCourses +
                ", quota='" + quota + '\'' +
                '}';
    }
}
