package aut.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Queue {
    private ArrayList<Person> personQueue;

    /**
     * this is a constructor for Queue class
     */
    public Queue() {
        personQueue = new ArrayList<>();
    }

    /**
     * this method add a new person to array list
     *
     * @param person
     */
    public void enqueue(Person person) {
        personQueue.add(person);
    }

    /**
     * this method remove a  person from array list
     */
    public void dequeue() {
        personQueue.remove(0);
    }

    /**
     * this is getter method for array list
     *
     * @return personQueue
     */
    public ArrayList<Person> getPersonQueue() {
        return personQueue;
    }

    /**
     * this is setter method for array list
     *
     * @param personQueue
     */
    public void setPersonQueue(ArrayList<Person> personQueue) {
        this.personQueue = personQueue;
    }
}
