package aut.company;

public class Person {
    private String name;
    private int time;

    /**
     * this is a constructor of person class and set name amn time
     *
     * @param name
     * @param time
     */
    public Person(String name, int time) {
        this.name = name;
        this.time = time;
    }

    /**
     * this is getter method for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * this is setter method for name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this is getter method for name
     *
     * @return time
     */
    public int getTime() {
        return time;
    }

    /**
     * this is setter method for name
     *
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }
}
