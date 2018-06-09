package aut.company.hw5;

public class CurrentAccount extends Account {
    private long overdraftLimit;

    /**
     * this is constructor and super account number
     *
     * @param num
     */
    public CurrentAccount(long num) {
        super(num);
    }

    /**
     * this is getter method
     *
     * @return
     */
    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * this is setter method
     *
     * @param overdraftLimit
     */
    public void setOverdraftLimit(long overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * this is toString method and override to account
     *
     * @return
     */
    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
