package Lab2.Abstraction;

abstract public class BankAccount {
    abstract void deposite();
    abstract void withdraw();
    abstract void display();
    
}

class Savings extends BankAccount{

    @Override
    void deposite() {
        System.out.println("Depositing in Savings Account");
        
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing from Savings Account");
        
    }

    @Override
    void display() {
        System.out.println("This is Savings Account");
        
    }
}

class Checking extends BankAccount{

    @Override
    void deposite() {
        System.out.println("Depositing in Checking Account");
        
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawing from Checking Account");
        
    }

    @Override
    void display() {
        System.out.println("This is Checking Account");
        
    }
}
