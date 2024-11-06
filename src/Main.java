import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(6);
        System.out.println(account.getTransactionHistory());

    Transaction transaction = new Transaction();
        System.out.println(transaction.getDate());
    }
}