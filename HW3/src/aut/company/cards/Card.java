package aut.company.cards;

import java.util.ArrayList;

public abstract class Card {
    private String name;
    private int hP;
    private int power;
    private boolean isAlive = true;
    private int increaseHPTime = 0;
    private int maxOfHP;

    public Card(String name, int hP, int power) {
        this.name = name;
        this.hP = hP;
        this.maxOfHP = hP;
        this.power = power;

    }

    public void attackedFromEnemy(Card card, String type) {
        if (card instanceof TwoOptionForAttack){
            if (type.equals("Hit")) {
               decreaseHP(((TwoOptionForAttack) card).getHit());
            }else if (type.equals("Kill")){
                decreaseHP(((TwoOptionForAttack) card).getKill());
            }
        }else if (card instanceof OneOptionToAttack){
            if (type.equals("Hit")){
                decreaseHP(((OneOptionToAttack)card).getHit());
            }
        }
    }


    public abstract boolean attacking(Card card, String type);

    public boolean helpFromOtherCard(int helpAmounts, ArrayList<Card> cards) {
       int helpAmount=0 ;
        helpAmount =helpAmounts/cards.size();
        if (checkHelp(helpAmount, cards) == 0) {
            for (Card card : cards) {
                if (helpAmount > card.getPower()) {
                    card.decreasePower(helpAmount);

                }
            }
            increasePower(helpAmounts);
            return true;
        } else {
            System.out.println("you can help from this card ........!");
            return false;
        }

    }

    public int checkHelp(int helpAmount, ArrayList<Card> cards) {
        int check = 0;
        for (Card card : cards) {
            if (card.getPower() <= helpAmount) {
                check++;
            }
        }
        return check;
    }

    public boolean decreasePower(int power) {
        if (this.power >power) {
            this.power -= power;
            return true;
        }else {
            System.out.println("you can attack this type before help");
            return false;
        }

    }

    public void decreaseHP(int hP) {
        this.hP -= hP;
        if (this.hP <= 0) {
            isAlive = false;
        }
    }

    public void increasePower(int power) {
        this.power += power;
    }

    public boolean fullHP() {
        if (increaseHPTime < 4) {
            hP = maxOfHP;
            increaseHPTime++;
            return true;
        } else {
            System.out.println("you do this option for 3 time and you can not do it any more...");
            return false;
        }
    }

    public int getHP() {
        return hP;
    }

    public void sethHP(int hP) {
        this.hP = hP;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncreaseHPTime() {
        return increaseHPTime;
    }

    public int getMaxOfHP() {
        return maxOfHP;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", hP=" + hP +
                ", power=" + power +
                '}';
    }
}
