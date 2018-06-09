package aut.company;

public class Employee {
    private String firstName;
    private String lastName;
    private String firstNameOfSpouse;
    private String lastNameOfSpouse;
    private int age;
    private int numOfChildren;

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, "unkhowm", "unkhown", age, 0);
    }

    public Employee(String firstName, String lastName,int age,String firstNameOfSpouse, String lastNameOfSpouse) {
        this(firstName, lastName, firstNameOfSpouse, lastNameOfSpouse, age, 0);
    }

    public Employee(String firstName, String lastName, String firstNameOfSpouse, String lastNameOfSpouse, int age, int numOfChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstNameOfSpouse = firstNameOfSpouse;
        this.lastNameOfSpouse = lastNameOfSpouse;
        this.age = age;
        this.numOfChildren = numOfChildren;
    }

    public void addChildrenNum(int numOfChildren) {
        this.numOfChildren += numOfChildren;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameOfSpouse() {
        return firstNameOfSpouse;
    }

    public void setFirstNameOfSpouse(String firstNameOfSpouse) {
        this.firstNameOfSpouse = firstNameOfSpouse;
    }

    public String getLastNameOfSpouse() {
        return lastNameOfSpouse;
    }

    public void setLastNameOfSpouse(String lastNameOfSpouse) {
        this.lastNameOfSpouse = lastNameOfSpouse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }


}
