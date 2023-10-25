package ku.atm;

//รักษิตา รัตนาลังการ 6310450654
public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
