package aut.company;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTag {
    private String carTag;
    private String firstName;
    private String lastName;
    private boolean registered;
    private ArrayList<String> fine;


    public CarTag(String carTag, String firstName, String lastName) {

        this(carTag, firstName, lastName, true);
    }

    public CarTag(String carTag, String firstName, String lastName, boolean registered) {
        this.fine = new ArrayList<String>();
        this.carTag = carTag;
        this.registered = registered;
        this.firstName = firstName;
        this.lastName = lastName;


    }

    public void printFine() {
        for (int i = 0; i < fine.size(); i++) {
            System.out.println(fine.get(i));
        }
    }

    public void addAndCheckFine(String newFine){
        fine.add(newFine);
        if(fine.size()>4){
            this.registered=false;
        }
    }
    public void clearAndCheckFine(String oldfine){
        Iterator iterator=fine.iterator();
        while (iterator.hasNext()){
          if (iterator.next()==oldfine){
              iterator.remove();
          }
        }
        if (fine.size()<5){
           this.registered=true;
        }
    }

    public String getCarTag() {
        return carTag;
    }

    public void setCarTag(String carTag) {
        this.carTag = carTag;
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

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public ArrayList<String> getFine() {
        return fine;
    }

    public void setFine(ArrayList<String> fine) {
        this.fine = fine;
    }
}
