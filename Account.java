public class Account {
    
    private String accountName;
    private double balance;

    public Account(String name, double balance){
        this.accountName = name;
        this.balance = balance;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccounrName(){
        return accountName;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void lodge(double amount){
        balance += amount;
    }

}
