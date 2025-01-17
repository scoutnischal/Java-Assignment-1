package Part1.Q2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = s.nextInt();
        
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
        } else {
            int sum = 0;
            int originalNumber = number;
            
            while (number > 0) {
     
                int digit = number % 10;
                
                sum += digit;
             
                number = number / 10;
            }
            
            System.out.println("The sum of digits in " + originalNumber + " is " + sum + ".");
        }
        
    }
}
