package aut.company;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private int grade;

    public Student() {
        this("unkhown first name", "unkhown last name", 0, 0);

    }

    /**
     * @param firstName is student first name
     * @param lastName  is student last name
     * @param id        is student id
     * @param grade     is student grade
     */
    public Student(String firstName, String lastName, int id, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printInfo() {
        System.out.println(firstName + " , " + lastName + ":" + id + "(" + grade + ")");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
