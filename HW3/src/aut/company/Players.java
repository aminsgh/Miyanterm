package aut.company;

import aut.company.cards.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Players extends GameRoll {
    private ArrayList finalAnimalList = new ArrayList();
    private ArrayList randomAnimalList = new ArrayList();
    private ArrayList<Integer> playerCardNumber = new ArrayList<>();

    public Players(String string) {
        if (string.equals("player")) {
            setFinalList();
        } else if (string.equals("pc")) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                playerCardNumber.add(random.nextInt(30));
            }
        }

    }

    public void setFinalList() {
        Scanner scanner = new Scanner(System.in);
        choosingList();
        System.out.println(toString());
        for (int i = 0; i < 10; i++) {
            playerCardNumber.add(scanner.nextInt() - 1);

        }
        setFinalAnimalsCard(playerCardNumber);
        System.out.println(toStringFinalList());
    }


    public void choosingList() {
        Random random = new Random();
        int tmp;
        for (int i = 0; i < 30; i++) {
            tmp = random.nextInt(60);
            randomAnimalList.add(getIndexOfAnimalArrayList(tmp));
        }
    }

    public void setFinalAnimalsCard(ArrayList<Integer> cardNumber) {
        for (int i = 0; i < 10; i++) {
            finalAnimalList.add((Card) randomAnimalList.get(cardNumber.get(i)));

        }
    }

    public String display() {
        String string = "";
        ArrayList<String> nameOfAnimal = new ArrayList<>();
        nameOfAnimal.add("Lion");
        nameOfAnimal.add("Bear");
        nameOfAnimal.add("Tiger");
        nameOfAnimal.add("Vulture");
        nameOfAnimal.add("Fox");
        nameOfAnimal.add("Elephant");
        nameOfAnimal.add("Wolf");
        nameOfAnimal.add("Hog");
        nameOfAnimal.add("Hippopotamus");
        nameOfAnimal.add("Cow");
        nameOfAnimal.add("Rabbit");
        nameOfAnimal.add("Turtle");
        int[] animalNum = new int[12];
        for (Object o : finalAnimalList) {
            if (o instanceof Lion) {
                animalNum[0]++;
            } else if (o instanceof Bear) {
                animalNum[1]++;
            } else if (o instanceof Tiger) {
                animalNum[2]++;
            } else if (o instanceof Vulture) {
                animalNum[3]++;
            } else if (o instanceof Fox) {
                animalNum[4]++;
            } else if (o instanceof Elephant) {
                animalNum[5]++;
            } else if (o instanceof Wolf) {
                animalNum[6]++;
            } else if (o instanceof Hog) {
                animalNum[7]++;
            } else if (o instanceof Hippopotamus) {
                animalNum[8]++;
            } else if (o instanceof Cow) {
                animalNum[9]++;
            } else if (o instanceof Rabbit) {
                animalNum[10]++;
            } else if (o instanceof Turtle) {
                animalNum[11]++;
            }
        }
        for (int i = 0; i < animalNum.length; i++) {
            if (animalNum[i] != 0) {
                string += animalNum[i] + "of" + nameOfAnimal.get(i) + "\n";
            }
        }
        return "Players{" +
                "finalAnimalList=\n" + string +
                '}';
    }

    public ArrayList getFinalAnimalList() {
        return finalAnimalList;
    }

    public Object getIndexOfFinalAnimalList(int index) {
        return finalAnimalList.get(index);
    }

    public void setFinalAnimalList(ArrayList finalAnimalList) {
        this.finalAnimalList = finalAnimalList;
    }

    public ArrayList getRandomAnimalList() {
        return randomAnimalList;
    }

    public void setRandomAnimalList(ArrayList randomAnimalList) {
        this.randomAnimalList = randomAnimalList;
    }

    public Object getIndexOfRandomAnimalList(int index) {
        return randomAnimalList.get(index);
    }


    public String toStringFinalList() {
        String string = "";
        for (int i = 0; i < finalAnimalList.size(); i++) {
            string += i + 1 +"."+finalAnimalList.get(i).toString() + "\n";
        }
        return "Players{" +
                getClass().getSimpleName()+"\n" + string +
                '}';
    }

    @Override
    public String
    toString() {
        String string = "";
        for (int i = 0; i < randomAnimalList.size(); i++) {
            string += i + 1 + "." + randomAnimalList.get(i).toString() + "\n";
        }
        return "Players{" +
                "randomAnimalList=\n" + string +
                '}';
    }
}
