import java.text.NumberFormat;
import java.util.Scanner;

public class Options {
    private int balance;
    private Scanner scanner = new Scanner(System.in);
    private String balanceCurrency;
    private int tracker;
    private int decider;

    public Options(){
    }
    
        public void checkBalance(){
            balance = getBalance();
            balanceCurrency = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println("Your current balance is " + balanceCurrency);
        }
            
        public void deposit(int deposit){
            System.out.println("How much would you like to deposit?");
            deposit = scanner.nextInt();
            balance += deposit; 
            tracker = deposit;
            decider = 1;
            System.out.println();
            balanceCurrency = NumberFormat.getCurrencyInstance().format(deposit);
            System.out.println("Successfully deposited " + balanceCurrency + "!");
        }
            
        public void withdraw(int withdraw){
            System.out.println("How much would you like to withdraw?");
            withdraw = scanner.nextInt();

            if(balance >= withdraw){
                balance -= withdraw; 
                tracker = withdraw;
                decider = -1;
                System.out.println();
                balanceCurrency = NumberFormat.getCurrencyInstance().format(withdraw);
                System.out.println("Successfully withdrew " + balanceCurrency + "!");
            }
            else
                throw new IllegalArgumentException();
        }
            
        public void previousTransaction(){
            var obj = new BankingReport();
            if(decider == 1){
                obj.getDisplay();
                balanceCurrency = NumberFormat.getCurrencyInstance().format(tracker);
                System.out.println( "Deposited: " + balanceCurrency);
                obj.getDisplay();
            }
            else if (decider == -1){
                obj.getDisplay();
                balanceCurrency = NumberFormat.getCurrencyInstance().format(tracker);
                System.out.println("Withdrew: " + balanceCurrency);
                obj.getDisplay();    
            }
            else{
               System.out.println("No previous transactions made"); 
            }
        }    
        
        public void calculateInterest(){ 
            double interest = .0189;
            double finalBalance = (interest * balance * getYears(10)) + balance;
            balanceCurrency = NumberFormat.getCurrencyInstance().format(finalBalance);

            System.out.println("The current interest rate is 1.89%");
            System.out.println("After " + getYears(10) + " years, your balance will be: " + balanceCurrency);
        }

        private int getYears(int years) {
            return years;
        }

        public int getBalance() {
            return balance;
        }
}
