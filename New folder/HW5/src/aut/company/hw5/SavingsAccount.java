package aut.company.hw5;

public class SavingsAccount extends Account {
    private long interestRate;

    /**
     * this is constructor and super account number
     *
     * @param num
     */
    public SavingsAccount(long num) {
        super(num);
    }

    /**
     * this method increase account by profit
     */
    public void addProfit() {
        deposit((getBalance() * interestRate) / 100);

    }

    /**
     * this is setter method
     *
     * @return interest rate
     */
    public long getInterestRate() {
        return interestRate;
    }

    /**
     * this is setter method
     *
     * @param interestRate
     */
    public void setInterestRate(long interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * this is toString method and override to account
     *
     * @return string of SavingAccount information
     */
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
