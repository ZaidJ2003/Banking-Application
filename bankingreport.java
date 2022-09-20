//delete class

// import java.util.Scanner;

// public class bankingreport{

// private String firstName;
// private String lastName;
// private String password;
// private String username;
// private Scanner scanner = new Scanner(System.in);
// private options check = new options();

// public bankingreport(){
// }

//     public void printReport() {
//         getDisplay();
//         System.out.println("Welcome to ZJ bank!");
//         getDisplay();
//         verification();
//         verification(); //only works to create 1 account 
//     }
    
//     public void getDisplay(){
//         System.out.println("''''''''''");
//     }
    
//     public void getMenu(){
//         while(true){
//             getMenuDisplay();
//             char option = scanner.next().charAt(0);
//             char toUpperCase = Character.toUpperCase(option);
//             System.out.println();
            
//             if (toUpperCase == 'A' )
//                 check.checkBalance();
//             else if(toUpperCase == 'B')
//                 check.deposit(0); 
//             else if(toUpperCase == 'C')
//             try{ 
//                 check.withdraw(0);
//             } catch (IllegalArgumentException e){
//                 System.out.println("\ninsufficient funds. your current balance($" + check.getBalance() + ") is too low");
//             }
//             else if(toUpperCase == 'D')
//                 check.previousTransaction();
//             else if(toUpperCase == 'E')
//                 check.calculateInterest();
//             else if(toUpperCase == 'F'){
//                 System.out.println("See you next time, " + getFirstName() + ", " + getLastName()+ "!");
//                 break;    
//             }
//             else
//                 System.out.println("Please enter a valid response.");
//         }
//     }    

//     private void verification(){
//         System.out.println("What would you like to do? \n\na.Sign in \nb.Create an account");
//         while(true){
//         char response = scanner.next().charAt(0);
//         char toLowerCase = Character.toLowerCase(response);
//         scanner.nextLine();
//             if(toLowerCase == 'a'){
//                 signIn();
//                 break;
//             }
//             else if(toLowerCase == 'b'){
//                 createAnAccount();
//                 break;
//             }
//             else{
//                 System.out.println("Invalid response. Enter 'a' to sign in or 'b' to create an account");
//             }
//         }
//     }

//     private void signIn() {
//         loop1 : while(true){
//             System.out.println("\nPlease Enter your username");
//             String inputUserName = scanner.nextLine();
//             System.out.println("Please Enter your password");
//             String inputPassword = scanner.nextLine();
//                 if(inputUserName.equals(username) && inputPassword.equals(password)){ 
//                     System.out.println("Successfuly logged in!");
//                         break;
//                 }
//                 else{
//                     System.out.println("Incorrect password or username.\n\na.Try again\nb.Create an account");
//                     loop2 : while(true){
//                         char response = scanner.next().charAt(0);
//                         char upperCase = Character.toUpperCase(response);
//                         scanner.nextLine();
//                             if(upperCase == 'B'){
//                                 createAnAccount();
//                                 break loop1;
//                             }
//                             else if(upperCase == 'A'){
//                                 break loop2;
//                             }

//                             else{
//                                 System.out.println("Invalid response.\n\na.Try again\nb.Create an account ");
//                             }
//                     }
//                 }
//         }
//     }

//     private void createAnAccount() {
//         System.out.println("Enter your first name");
//         firstName = scanner.nextLine();
//         System.out.println("Enter your last name");
//         lastName = scanner.nextLine();
//         System.out.println("Create a username");
//         username = scanner.nextLine();
//             while(true){
//                 System.out.println("Create a password");
//                 password = scanner.nextLine();
//                     if(password.length() >= 8){
//                         break;
//                     }
//                     else{
//                         System.out.println("Password must be at least 8 characters.\n");
//                     }
//             }
//         System.out.println("Account Successfully created!\n");
//     }

//     private void getMenuDisplay() {
//         System.out.println("\nWhat would you like to do, " + getFirstName() + ", "+ getLastName()+ "? \n\nA. Check your balance\nB. Make a deposit\nC. Make a withdrawl\nD. view previous transaction\nE. Calculate interest\nF. sign out \n");
//     }

//     private String getFirstName(){
//         return firstName;
//     }

//     private char getLastName(){
//        return lastName.charAt(0);
//     }
// }
        
        
        