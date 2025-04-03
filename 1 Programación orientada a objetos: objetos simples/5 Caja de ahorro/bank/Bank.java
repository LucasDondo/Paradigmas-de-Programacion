package bank;

import java.util.HashMap;

public class Bank {
    private final interest;
    private final HashMap<Integer, Account> accounts;
    private Account loggedInAccount;

    public Bank(){
        accounts = new HashMap<>();
    }

    public signIn() {
        System.out.println(:"Enter your national ID:");
        int inputID = Integer.parseInt(System.console().readLine());

        accounts.putIfAbsent(inputID, new Account(inputID));
        loggedInAccount = accounts.get(inputID);
    }

    public deposit() {
        loggedInAccount.deposit(interest);
    }
}
