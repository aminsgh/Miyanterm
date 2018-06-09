package aut.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1=new User("AMIN",1);
        User user2=new User("ALI",2);
        User user3=new User("gholi",3);
        Voting voting2=new Voting();
        voting2.aVoting(user2,1);
        voting2.aVoting(user3,3);
        voting2.aVoting(user1,1);
        voting2.aVoting(user1,1);
        voting2.printUser();
        voting2.numberOfChoice(1);




    }
}
