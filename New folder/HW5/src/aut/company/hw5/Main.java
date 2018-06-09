package aut.company.hw5;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(1);
        savingsAccount1.deposit(100);
        savingsAccount1.withdraw(1);
        savingsAccount1.setInterestRate(9);
        savingsAccount1.addProfit();
        System.out.println(savingsAccount1.getBalance());
        savingsAccount1.print();

        SavingsAccount savingsAccount2 = new SavingsAccount(2);
        savingsAccount2.deposit(20);
        savingsAccount2.withdraw(1);
        savingsAccount2.setInterestRate(19);
        savingsAccount2.addProfit();
        System.out.println(savingsAccount2.getBalance());
        savingsAccount2.print();

        SavingsAccount savingsAccount3 = new SavingsAccount(3);
        savingsAccount3.deposit(30);
        savingsAccount3.withdraw(1);
        savingsAccount3.setInterestRate(29);
        savingsAccount3.addProfit();
        System.out.println(savingsAccount3.getBalance());
        savingsAccount3.print();

        SavingsAccount savingsAccount4 = new SavingsAccount(4);
        savingsAccount4.deposit(40);
        savingsAccount4.withdraw(1);
        savingsAccount4.setInterestRate(39);
        savingsAccount4.addProfit();
        System.out.println(savingsAccount4.getBalance());
        savingsAccount4.print();

        SavingsAccount savingsAccount5 = new SavingsAccount(5);
        savingsAccount5.deposit(50);
        savingsAccount5.withdraw(1);
        savingsAccount5.setInterestRate(49);
        savingsAccount5.addProfit();
        System.out.println(savingsAccount5.getBalance());
        savingsAccount5.print();

        CurrentAccount currentAccount1 = new CurrentAccount(11);
        currentAccount1.deposit(110);
        currentAccount1.withdraw(1);
        currentAccount1.setOverdraftLimit(122);
        System.out.println(currentAccount1.getBalance());
        currentAccount1.print();

        CurrentAccount currentAccount2 = new CurrentAccount(22);
        currentAccount2.deposit(220);
        currentAccount2.withdraw(1);
        currentAccount2.setOverdraftLimit(122);
        System.out.println(currentAccount2.getBalance());
        currentAccount2.print();

        CurrentAccount currentAccount3 = new CurrentAccount(33);
        currentAccount3.deposit(330);
        currentAccount3.withdraw(1);
        currentAccount3.setOverdraftLimit(122);
        System.out.println(currentAccount3.getBalance());
        currentAccount3.print();

        CurrentAccount currentAccount4 = new CurrentAccount(44);
        currentAccount4.deposit(440);
        currentAccount4.withdraw(1);
        currentAccount4.setOverdraftLimit(600);
        System.out.println(currentAccount4.getBalance());
        currentAccount4.print();

        CurrentAccount currentAccount5 = new CurrentAccount(55);
        currentAccount5.deposit(550);
        currentAccount5.withdraw(1);
        currentAccount5.setOverdraftLimit(600);
        System.out.println(currentAccount5.getBalance());
        currentAccount5.print();


        Bank bank = new Bank();
        bank.addAccount(savingsAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(savingsAccount3);
        bank.addAccount(savingsAccount4);
        bank.addAccount(savingsAccount5);
        bank.addAccount(currentAccount1);
        bank.addAccount(currentAccount2);
        bank.addAccount(currentAccount3);
        bank.addAccount(currentAccount4);
        bank.addAccount(currentAccount5);
        bank.Update();

    }
}
