import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNum;
    private float balance;
    private ArrayList<String> transactionHistory;


    public BankAccount() {
        this.transactionHistory = new ArrayList<>();
    }


    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void deposit (float amount){
        setBalance(balance+amount);
        String amountStringified = amount + "kd deposited to your account,\n current balance: "+ balance;
        transactionHistory.add(amountStringified);
    }
    public void withdraw(float amount){
        balance -=amount;
        String amountStringified = amount + "kd withdrawn from your account,\n current balance: "+ balance;

        this.transactionHistory.add(amountStringified);
    }
    public String transactionHistory(){
     return transactionHistory.toString();
    }

}
