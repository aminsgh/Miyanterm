package aut.company.hw5;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts;

    /**
     * this is constructor of class
     */
    public Bank() {
        accounts = new ArrayList<>();
    }

    /**
     * this method add new account to the account list
     *
     * @param account
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * this method check account
     * if the account be instance of SavingAccount add a profit of account
     * if the account be instance of CurrentAccount  go and check limit of account
     */
    public void Update()

    {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) instanceof SavingsAccount)
                ((SavingsAccount) accounts.get(i)).addProfit();
            else if (accounts.get(i) instanceof CurrentAccount) {
                if (accounts.get(i).getBalance() < ((CurrentAccount) accounts.get(i)).getOverdraftLimit()) {
                    accounts.get(i).print();
                    System.out.println(accounts.get(i).getAccountNumber());
                }
            }


        }

    }
}
