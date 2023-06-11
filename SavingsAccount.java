public class SavingsAccount extends Account {
    private double balance;
    public SavingsAccount(String accountName, double balance, String accountHolder){
        super(accountName, balance, accountHolder);//super goes to super class and calls the super class's constructor

    }

    public double calculateInterest(int time){
        return time * balance * 0.1f;
    }
}


