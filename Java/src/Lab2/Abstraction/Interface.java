package Lab2.Abstraction;

interface Bank {
    void deposite();
    void withdraw();
    void display();
}

class SavingI implements Bank {
    @Override
    public void deposite() {
        System.out.println("Depositing in ");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Saving Account");
    }

    @Override
    public void display() {
        System.out.println("This is Saving Account");
    }
}

class CheckingI implements Bank {
    @Override
    public void deposite() {
        System.out.println("Depositing in Checking Account");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Checking Account");
    }

    @Override
    public void display() {
        System.out.println("This is Checking Account");
    }
}
