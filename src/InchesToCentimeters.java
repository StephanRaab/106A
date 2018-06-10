/**
 * The InchesToCentimeters Class
 * @author Stephan Raab
 */

import java.util.Scanner;

public class InchesToCentimeters {

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		/**
		 * Set centimeter constant
		 * @param constant 1 inch = 2.54cm
		 */
		double CM = 2.54;
		
		System.out.println("Converting height from feet and inches to centimeters?");
		System.out.print("Enter number of feet: ");
		/**
		 * Get user input for feet
		 * @input input height in feet
		 */
		int feet = user_input.nextInt();
		
		System.out.print("Enter number of inches: ");
		/**
		 * Get user input for inches
		 * @input input height in inches
		 */
		int inches = user_input.nextInt();
		
		int totalInches = (feet * 12) + inches;
		double totalCm = totalInches * CM;
		
		System.out.println(feet + "ft " + inches +"in = " + totalCm + "cm.");
	}

}
