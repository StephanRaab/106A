import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("This program converts Fahrenheit to Celsius");
		System.out.print("Enter Fahrenheit temperature: ");
		int fahrenheit = user_input.nextInt();
		
		double fahrenheitInCelsius = ((fahrenheit-32)*5)/9;
		System.out.println("Celsius equivalent = " + fahrenheitInCelsius);
	}
}
