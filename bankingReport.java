import java.util.Scanner;

public class bankingreport{

private String firstName;
private String lastName;
private String password;
private String userName;
private Scanner scanner = new Scanner(System.in);
private options check = new options();
private int account = 0; 
private String[] usernames = new String[2]; 
private String[] passwords = new String[2]; 
private String[] firstnames = new String[2];
private String[] lastnames = new String[2];
private int firstNameCounter;
private int lastNameCounter;
String inputUserName;
String inputPassword;

public bankingreport(){
}

    public void printReport() {
        getDisplay();
        System.out.println("Welcome to ZJ bank!");
        getDisplay();
        for(int i = 0; i < account + 1; i++){
            verification();
        }
    }
    
    public void getDisplay(){
        System.out.println("''''''''''");
    }
    
    public void getMenu(){
        while(true){
            getMenuDisplay();
            char option = scanner.next().charAt(0);
            char toUpperCase = Character.toUpperCase(option);
            System.out.println();
            
            if (toUpperCase == 'A' )
                check.checkBalance();
            else if(toUpperCase == 'B')
                check.deposit(0); 
            else if(toUpperCase == 'C')
            try{ 
                check.withdraw(0);
            } catch (IllegalArgumentException e){
                System.out.println("\ninsufficient funds. your current balance($" + check.getBalance() + ") is too low");
            }
            else if(toUpperCase == 'D')
                check.previousTransaction();
            else if(toUpperCase == 'E')
                check.calculateInterest();
            else if(toUpperCase == 'F'){
                System.out.println("See you next time, " +getFirstName() + "!");
                break;    
            }
            else
                System.out.println("Please enter a valid response.");
        }
    }    

    private void verification(){
        System.out.println("What would you like to do? \n\na.Sign in \nb.Create an account");
        while(true){
        char response = scanner.next().charAt(0);
        char toLowerCase = Character.toLowerCase(response);
        scanner.nextLine();
            if(toLowerCase == 'a'){
                signIn();
                break;
            }
            else if(toLowerCase == 'b'){
                createAnAccount();
                break;
            }
            else{
                System.out.println("Invalid response. Enter 'a' to sign in or 'b' to create an account");
            }
        }
    }

    private void signIn() {
        loop1 : while(true){
            int userNameCounter = 0; 
            int passWordCounter = 0; 
            System.out.println("\nPlease Enter your username");
            inputUserName = scanner.nextLine();
                innerloop: for(int i = 0; i < usernames.length; i++){ 
                    if(usernames[i] == null);
                    else if(usernames[i].equals(inputUserName)){
                        userNameCounter++;
                        break innerloop;
                    }
                }
            System.out.println("Please Enter your password");
            inputPassword = scanner.nextLine();
               innerloop: for(int i = 0; i < passwords.length; i++){ 
                    if(passwords[i] == null);
                    else if(passwords[i].equals(inputPassword)){
                        passWordCounter++;
                        break innerloop;
                    }
                }
                if(userNameCounter == 1 && passWordCounter == 1){ 
                    System.out.println("Successfuly logged in!");
                        break;
                }
                else{
                    System.out.println("Incorrect password or username.\n\na.Try again\nb.Create an account");
                    loop2 : while(true){
                        char response = scanner.next().charAt(0);
                        char upperCase = Character.toUpperCase(response);
                        scanner.nextLine();
                            if(upperCase == 'B'){
                                createAnAccount();
                                break loop1;
                            }
                            else if(upperCase == 'A'){
                                break loop2;
                            }

                            else{
                                System.out.println("invalid response.\n\na.Try again\nb.Create an account ");
                            }
                    }

                }
        }
    }

    private void createAnAccount() {
        System.out.println("Enter your first name");
        firstName = scanner.nextLine();
        firstnames[firstNameCounter] = firstName;
        System.out.println("Enter your last name");
        lastName = scanner.nextLine();
        lastnames[lastNameCounter] = lastName;
        System.out.println("Create a username");
        userName = scanner.nextLine();
        usernames[account] = userName; 
            while(true){
                System.out.println("Create a password");
                password = scanner.nextLine();
                    if(password.length() >= 8){
                        passwords[account] = password; 
                        break;
                    }
                    else{
                        System.out.println("password must be at least 8 characters.\n");
                    }
            }
        System.out.println("Account Successfully created!\n");
        account++; firstNameCounter++; lastNameCounter++;
    }

    private void getMenuDisplay() {
        System.out.println("\nWhat would you like to do, " + getFirstName() + ", "+ getLastName()+ "? \n\nA. Check your balance\nB. Make a deposit\nC. Make a withdrawl\nD. view previous transaction\nE. Calculate interest\nF. sign out \n");
    }

    private String getFirstName(){
        for(int i =0; i<usernames.length; i++){
            if(inputUserName.equals(usernames[i]))
                firstName = firstnames[i];
        }   
    return firstName;
    }

    private char getLastName(){
        for(int i =0; i<passwords.length; i++){
            if(inputPassword.equals(passwords[i]))
            lastName = lastnames[i];
        }   
    return lastName.charAt(0);
    }
}

