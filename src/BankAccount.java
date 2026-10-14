public class BankAccount {
    private String accountHolder;
    private double accountNumber;
    private double balance;
    private double withdrawAmount;
    private double newBalance;

    BankAccount(String accountHolder, double accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit (double amount){
          if (amount > 0){
              System.out.println("Valid deposit");
              System.out.println("New amount:" + (amount + this.balance));
              newBalance = amount + this.balance;
          } else {
              System.out.println("Invalid");
          }

    }

    void withdraw (double amount){
        if(amount < newBalance){;
            withdrawAmount = amount;
            System.out.println("You withdrew this amount:" + withdrawAmount);
        }
    }

    void getBalance(){
        System.out.println("Remaining balance is:R " + (newBalance - withdrawAmount));
    }

}
