package bank;

public class Account {
    private int nationalID;
    private int balance;

    public Account(int nationalID) {
        this.nationalID = nationalID;
        balance = 0;
    }

    public deposit(int interest) {
        System.out.println("How much money do you want to deposit?");
        int inputAmount = Integer.parseInt(System.console().readLine());

        System.out.format("\nWe have an interest rate of %d.", interest);
        System.out.println("We can show you the amount of money you'll have by making this deposit.");
        System.out.println("Select the number of months ahead you'd like to peek at:");
        int inputMonths = Integer.parseInt(System.console().readLine());

        System.out.format("By confirming this deposit, in %d months you'll have $%d in your account, while currently you have (only) $%d.", inputMonths, calcFutureBalance(balance + inputAmount, inputMonths, interest), balance);
        System.out.println("Do you want to confirm your deposit?");
        System.out.println("y: Yes.");
        System.out.println("n: No.");
        String inputConfirmation = System.console().readLine();
        if (inputConfirmation == "y") {
            balance += inputAmount;
        }
    }

    private int calcFutureBalance(int simulatedCurrentBalance, monthsAhead, interest) {
        if (monthsAhead == 0) {
            return simulatedCurrentBalance;
        }

        return calcFutureBalance(simulatedCurrentBalance + (interest * simulatedCurrentBalance / 100), monthsAhead - 1);
    }
}
