package aut.company.hw6;

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent1 = new UndergraduateStudent("a1", "aa1", 1, "usual");
        undergraduateStudent1.UndergraduateStudentInformation();

        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("a2", "aa2", 2, "usual");
        undergraduateStudent2.UndergraduateStudentInformation();

        UndergraduateStudent undergraduateStudent3 = new UndergraduateStudent("a3", "aa3", 3, "usual");
        undergraduateStudent3.UndergraduateStudentInformation();

        UndergraduateStudent undergraduateStudent4 = new UndergraduateStudent("a4", "aa4", 4, "usual");
        undergraduateStudent4.UndergraduateStudentInformation();

        UndergraduateStudent undergraduateStudent5 = new UndergraduateStudent("a5", "aa5", 5, "usual");
        undergraduateStudent5.UndergraduateStudentInformation();

        GraduateStudent graduateStudent1 = new GraduateStudent("b1", "bb1", 6, "p1", "Amirkabir");
        graduateStudent1.GraduateStudentInformation();
        GraduateStudent graduateStudent2 = new GraduateStudent("b2", "bb2", 7, "p2", "Amirkabir");
        graduateStudent2.GraduateStudentInformation();
        GraduateStudent graduateStudent3 = new GraduateStudent("b3", "bb3", 8, "p3", "Amirkabir");
        graduateStudent3.GraduateStudentInformation();
        GraduateStudent graduateStudent4 = new GraduateStudent("b4", "bb4", 9, "p4", "Amirkabir");
        graduateStudent4.GraduateStudentInformation();
        GraduateStudent graduateStudent5 = new GraduateStudent("b5", "bb5", 10, "p5", "Amirkabir");
        graduateStudent5.GraduateStudentInformation();


    }
}

