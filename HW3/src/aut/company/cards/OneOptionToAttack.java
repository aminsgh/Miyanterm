package aut.company.cards;

public class OneOptionToAttack extends Card {
    private int hit;

    public OneOptionToAttack(String name, int hP, int power, int hit) {
        super(name, hP, power);
        this.hit = hit;
    }

    @Override
    public boolean attacking(Card card, String type) {
        if (type.equals("Hit")) {
            if (decreasePower(hit)) {
                card.decreaseHP(hit);
                return true;
            } else {
                return false;
            }

        } else if (type.equals("Kill")) {
            System.out.println("we can just Hit...");
            if (decreasePower(hit)) {
                card.decreaseHP(hit);
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("this card just have a hitting attack..........");
            return false;
        }

    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
