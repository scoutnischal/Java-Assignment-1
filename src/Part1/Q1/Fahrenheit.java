package Part1.Q1;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		 System.out.print("Enter the temperature in Fahrenheit: ");
	        double fahrenheit = s.nextDouble();
	        
	        double celsius = (fahrenheit - 32) * 5 / 9;
	        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", fahrenheit, celsius);  
	}
}
