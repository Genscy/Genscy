package dowhileifelse;

import java.io.*;

import java.util.Scanner;

public class Dowhileifelse {

            
    public static void main(String[] args) {
        char chr;
        
        do {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter Username: ");
            String userName = input.nextLine();
        
            
            System.out.println("Enter your Password: ");
            String psw = input.nextLine();
            
            if (userName.equalsIgnoreCase("Genscy0903") && psw.equals("090903")) {
                    System.out.println("Welcome, Master!");
                    break;
            } else {
            System.out.println("Login Failed!");
            } System.out.println("Continue? press Y for yes/ N for no");
            chr = input.next().charAt(0);
        } while(chr == 'y' || chr == 'Y');
        
    }
}
