package aut.company;

import aut.company.cards.*;

import java.util.ArrayList;

public class GameRoll {
    private static ArrayList animals = new ArrayList();

    public GameRoll() {
        addLions();
        addBears();
        addTigers();
        addElephants();
        addCows();
        addVultures();
        addFoxes();
        addWolves();
        addHogs();
        addHippopotamus();
        addRabbits();
        addTurtles();

    }

    public void addLions() {
        Lion lion1 = new Lion();
        Lion lion2 = new Lion();
        Lion lion3 = new Lion();
        Lion lion4 = new Lion();
        Lion lion5 = new Lion();
        animals.add(0, lion1);
        animals.add(1, lion2);
        animals.add(2, lion3);
        animals.add(3, lion4);
        animals.add(4, lion5);
    }

    public void addBears() {
        Bear bear1 = new Bear();
        Bear bear2 = new Bear();
        Bear bear3 = new Bear();
        Bear bear4 = new Bear();
        Bear bear5 = new Bear();
        animals.add(5, bear1);
        animals.add(6, bear2);
        animals.add(7, bear3);
        animals.add(8, bear4);
        animals.add(9, bear5);
    }

    public void addTigers() {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Tiger tiger3 = new Tiger();
        Tiger tiger4 = new Tiger();
        Tiger tiger5 = new Tiger();
        animals.add(10, tiger1);
        animals.add(11, tiger2);
        animals.add(12, tiger3);
        animals.add(13, tiger4);
        animals.add(14, tiger5);
    }

    public void addElephants() {
        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();
        Elephant elephant3 = new Elephant();
        Elephant elephant4 = new Elephant();
        Elephant elephant5 = new Elephant();
        animals.add(15, elephant1);
        animals.add(16, elephant2);
        animals.add(17, elephant3);
        animals.add(18, elephant4);
        animals.add(19, elephant5);
    }

    public void addCows() {
        Cow cow1 = new Cow();
        Cow cow2 = new Cow();
        Cow cow3 = new Cow();
        Cow cow4 = new Cow();
        Cow cow5 = new Cow();
        animals.add(20, cow1);
        animals.add(21, cow2);
        animals.add(22, cow3);
        animals.add(23, cow4);
        animals.add(24, cow5);
    }

    public void addVultures() {
        Vulture vulture1 = new Vulture();
        Vulture vulture2 = new Vulture();
        Vulture vulture3 = new Vulture();
        Vulture vulture4 = new Vulture();
        Vulture vulture5 = new Vulture();
        animals.add(25, vulture1);
        animals.add(26, vulture2);
        animals.add(27, vulture3);
        animals.add(28, vulture4);
        animals.add(29, vulture5);
    }

    public void addFoxes() {
        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        Fox fox3 = new Fox();
        Fox fox4 = new Fox();
        Fox fox5 = new Fox();
        animals.add(30, fox1);
        animals.add(31, fox2);
        animals.add(32, fox3);
        animals.add(33, fox4);
        animals.add(34, fox5);
    }

    public void addWolves() {
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();
        Wolf wolf3 = new Wolf();
        Wolf wolf4 = new Wolf();
        Wolf wolf5 = new Wolf();
        animals.add(35, wolf1);
        animals.add(36, wolf2);
        animals.add(37, wolf3);
        animals.add(38, wolf4);
        animals.add(39, wolf5);
    }

    public void addHogs() {
        Hog hog1 = new Hog();
        Hog hog2 = new Hog();
        Hog hog3 = new Hog();
        Hog hog4 = new Hog();
        Hog hog5 = new Hog();
        animals.add(40, hog1);
        animals.add(41, hog2);
        animals.add(42, hog3);
        animals.add(43, hog4);
        animals.add(44, hog5);
    }

    public void addHippopotamus() {
        Hippopotamus hippopotamus1 = new Hippopotamus();
        Hippopotamus hippopotamus2 = new Hippopotamus();
        Hippopotamus hippopotamus3 = new Hippopotamus();
        Hippopotamus hippopotamus4 = new Hippopotamus();
        Hippopotamus hippopotamus5 = new Hippopotamus();
        animals.add(45, hippopotamus1);
        animals.add(46, hippopotamus2);
        animals.add(47, hippopotamus3);
        animals.add(48, hippopotamus4);
        animals.add(49, hippopotamus5);
    }

    public void addRabbits() {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();
        Rabbit rabbit4 = new Rabbit();
        Rabbit rabbit5 = new Rabbit();
        animals.add(50, rabbit1);
        animals.add(51, rabbit2);
        animals.add(52, rabbit3);
        animals.add(53, rabbit4);
        animals.add(54, rabbit5);
    }

    public void addTurtles() {
        Turtle turtle1 = new Turtle();
        Turtle turtle2 = new Turtle();
        Turtle turtle3 = new Turtle();
        Turtle turtle4 = new Turtle();
        Turtle turtle5 = new Turtle();
        animals.add(55, turtle1);
        animals.add(56, turtle2);
        animals.add(57, turtle3);
        animals.add(58, turtle4);
        animals.add(59, turtle5);
    }

    public static ArrayList getAnimals() {
        return animals;
    }
    public static Object getIndexOfAnimalArrayList(int index){
        return animals.get(index);
    }

    public static void setAnimals(ArrayList animals) {
        GameRoll.animals = animals;
    }


}
