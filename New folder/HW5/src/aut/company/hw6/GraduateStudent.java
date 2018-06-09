package aut.company.hw6;

public class GraduateStudent extends Student {
    private int allCourses = 32;
    private String professor;
    private String undergraduateUnivercity;

    public GraduateStudent(String firstName, String lastName, int id, String professor, String undergraduateUnivercity) {
        super(firstName, lastName, id);
        this.professor = professor;
        this.undergraduateUnivercity = undergraduateUnivercity;
    }

    public GraduateStudent(String professor, String undergraduateUnivercity) {
        this("", "", 0, professor, undergraduateUnivercity);
    }

    public void GraduateStudentInformation() {
        System.out.println("GraduateStudent{" +
                "allCourses=" + allCourses +
                ", professor='" + professor + '\'' +
                ", undergraduateUnivercity='" + undergraduateUnivercity + '\'' +
                '}');
    }

    public int getAllCourses() {
        return allCourses;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getUndergraduateUnivercity() {
        return undergraduateUnivercity;
    }

    public void setUndergraduateUnivercity(String undergraduateUnivercity) {
        this.undergraduateUnivercity = undergraduateUnivercity;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "allCourses=" + allCourses +
                ", professor='" + professor + '\'' +
                ", undergraduateUnivercity='" + undergraduateUnivercity + '\'' +
                '}';
    }
}
