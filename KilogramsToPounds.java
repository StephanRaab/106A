import java.util.Scanner;

public class KilogramsToPounds {
	private static final double POUNDS_PER_KILOGRAM = 2.2;
	private static final int OUNCES_PER_POUND = 16;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
				
		System.out.println("Converting from Kilograms to Pounds and Ounces");
		
		System.out.print("Enter weight in Kilograms: ");
		double kg = user_input.nextDouble();
		
		double lbs = (kg * POUNDS_PER_KILOGRAM);
		double oz = (lbs * OUNCES_PER_POUND) % 16;
		String formattedOz = String.format("%.1f", oz);
		
		System.out.printf(kg + "kg = " + (int)lbs + "lbs and " + formattedOz + "oz.", oz);
	}
}
