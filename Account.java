
public class Account{
    private String accountNumber;
    private double balance;
    private String accountHolder;


    public Account(String accountNumber, double balance, String accountHolder){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public double calculateInterest(int time){
        return time * balance * .001;
    }

    public boolean deposit(double money){
        if (money > 0){
            this.balance +=money;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Zina", 34.50, "skdjskl");
        double timeSaved = savings.calculateInterest(3);

        System.out.println(timeSaved);

    }

}
