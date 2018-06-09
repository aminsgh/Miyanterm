package aut.company.hw5;

import java.util.Objects;

public class Account {
    private long balance;
    private long accountNumber;

    /**
     * this is constructor of class
     * set account number
     *
     * @param num
     */
    public Account(long num) {
        balance = 0;
        accountNumber = num;
    }

    /**
     * this method increase balance of account
     *
     * @param amount
     */
    public void deposit(long amount) {
        if (amount > 0) balance += amount;
        else System.err.println("Invalid deposit amount!");
    }

    /**
     * this method decrease balance of account
     *
     * @param amount
     */
    public void withdraw(long amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.err.println("Invalid withdraw amount!");
    }

    /**
     * this is getter method
     *
     * @return balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * this is getter method
     *
     * @return account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * this method making a string
     *
     * @return account information
     */
    public String toString() {
        return "Account Number #" + accountNumber + "--> balance = " + balance;
    }

    /**
     * this method print string of returned by toString method
     */
    public final void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance &&
                accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(balance, accountNumber);
    }
}
