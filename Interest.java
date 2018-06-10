import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Interest calculation program");
		
		System.out.print("Enter starting balance: ");
		int startingBalance = user_input.nextInt();
		
		System.out.print("Enter annual interestrate: ");
		double annualInterest = user_input.nextDouble();
		
		double firstYearBalance = (startingBalance * (annualInterest/100)) + startingBalance;
		double secondYearBalance = (firstYearBalance * (annualInterest/100)) + firstYearBalance;
		System.out.println("Balance after one year = " + firstYearBalance);
		System.out.println("Balance after two years = " + secondYearBalance);
	}

}
