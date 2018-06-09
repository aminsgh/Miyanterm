package aut.company;

public class Item {
    private String name;
    private String producer;
    private int amount;

    public Item(String name, String producer) {
        this(name,producer,0);

    }

    public Item(String name, String producer, int amount) {
        this.amount = amount;
        this.producer = producer;
        this.name = name;
    }

    public void increment(int i) {
        this.amount = this.amount + i;

    }

    public void decrement(int i) {
        this.amount = this.amount - i;

    }

    public void printItem() {
        System.out.println("//**name:" + name+"\n" +" //** producer:" + producer +"\n" + "  //** amount:" + amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
