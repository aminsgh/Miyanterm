package aut.company;

public class Lab {
    private Student[] students;
    private int average;
    private int capacity;
    private int currentSize;
    private String day;

    /**
     *
     * @param capacity is the lab capacity
     * @param day is a date of lab
     */
    public Lab(int capacity, String day) {
        students = new Student[capacity];
        this.day = day;
        this.capacity = capacity;
    }

    public void addNewStudent(Student student) {
        if (currentSize < capacity) {
            this.students[currentSize] = student;
            currentSize++;
        } else {
            System.out.println("lab id full!!??");
        }

    }

    public void clculateAverege() {
        int averege = 0;
        for (int i = 0; i < currentSize; i++) {
            averege += students[i].getGrade();

        }
        this.average = averege / (currentSize );
    }

    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println("first name:" + students[i].getFirstName() + " last name:" + students[i].getLastName() + " id:" + students[i].getId());

        }
        System.out.println("average:"+average);
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public Student[] getStudents( ) {

        return students;
    }

    public void setStudents(Student[] student) {
        this.students =student;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

}
