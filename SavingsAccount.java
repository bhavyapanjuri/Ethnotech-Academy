class Inheritance {
    public static void main(String[] args) {
    Bankbalance b1 = new Bankbalance();
    b1.setBalance(1000);
    System.out.println("Balance: " + b1.getBalance());
    }
}
class Bankbalance {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}   
public class SavingsAccount extends Bankbalance {
    private double interestRate;
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
}

