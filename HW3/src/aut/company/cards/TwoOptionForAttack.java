package aut.company.cards;

public class TwoOptionForAttack extends Card {
    private int kill;
    private int hit;

    public TwoOptionForAttack(String name, int hP, int power, int kill, int hit) {
        super(name, hP, power);
        this.kill = kill;
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
            if (decreasePower(kill)) {
                card.decreaseHP(kill);
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("type is nat valid.......");
            return false;
        }
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
