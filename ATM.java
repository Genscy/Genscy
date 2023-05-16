import java.text.NumberFormat;
import java.util.Scanner;

public class Atm2 {
    
    static int balance = 20000;
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int withdraw, deposit ; 
    char chr, selection;
    boolean running = true;
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(balance);
             
   while (running)
    
       do {
          
            System.out.print("Enter Username: ");
            String userName = scan.nextLine();
        
            
            System.out.print("Enter your Password: ");
            String psw = scan.nextLine();
            
           
             
            if (userName.equalsIgnoreCase("Genscy0903") && psw.equals("123")) {
                    System.out.println("Welcome, Master!");
                    
                System.out.println("===========ATM==========");    
     
                System.out.println("Balance: " + result);
                
                System.out.println(" ");
                System.out.println("Choose [1] for Widthraw");
                System.out.println("Choose [2] for Deposit");
                System.out.println("Choose [3] for Check Balance");
                System.out.println("Choose [4] to EXIT");
                System.out.println("========================");
                
               
                
                selection = scan.next().charAt(0);
              
                switch (selection){
                    
                    case '1': 
                        System.out.print("Enter money you want to withdraw: ");
                        withdraw = scan.nextInt();
                        
                        if (balance >= withdraw){
                            balance = balance - withdraw;
                           
                            System.out.println("You successfuly withdraw " + withdraw + ", your new balance is balance " + result);
                            System.out.println("===========ATM==========");
                            System.out.println("Balance: " + result);
                            System.out.println(" ");
                            System.out.println("\nChoose [1] for Widthraw \nChoose [2] for Deposit \nChoose [3] for Check Balance \nChoose [4] to EXIT");
                            System.out.println("========================");
                            break;
                        } else {
                            System.err.println("Insufficient Balance, \nyour balance is " + result);
                        } 
                    case '2': 
                        System.out.println("Enter amaount you want to deposit: ");
                        deposit = scan.nextInt();
                        balance = balance + deposit;
                        
                        System.out.println("Success! \nyour new balance is: " + result);
                         System.out.println("===========ATM==========");
                         System.out.println("Balance: " + result);
                         System.out.println(" ");
                         System.out.println("\nChoose [1] for Widthraw \nChoose [2] for Deposit \nChoose [3] for Check Balance \nChoose [4] to EXIT");
                         System.out.println("========================");
                        break;
                    case '3': 
                        System.out.println("Your current balance is: " + result);
                        System.out.println("===========ATM==========");
                         System.out.println("Balance: " + result);
                         System.out.println(" ");
                         System.out.println("\nChoose [1] for Widthraw \nChoose [2] for Deposit \nChoose [3] for Check Balance \nChoose [4] to EXIT");
                         System.out.println("========================");
                        break;
                    case '4': 
                        running = false;
                        
                    default: 
                        System.out.println("Invalid Operation!");
                        break;
                }       
            } else {
            System.err.println("Login Failed!");
            }System.out.println("Continue? press Y for yes/ N for no");
            
            chr = scan.next().charAt(0);
        } while(chr == 'y' || chr == 'Y');
          
        }
    
    }
