import java.text.NumberFormat;
import java.util.Scanner;

public class ReceiptTipCalculation  {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);

        System.out.print("What's your bill total today: ");
        double billTotal = user_input.nextDouble();

        System.out.print("How much would you like to tip: ");
        double tipAmount = user_input.nextDouble() / 100;
        double tipCalc = billTotal * tipAmount;
        double payTotalCalc = tipCalc + billTotal;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("Tip: " + formatter.format(tipCalc));
        System.out.println("Total: " + formatter.format(payTotalCalc));
    }
}
