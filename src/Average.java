import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner user_input = new Scanner(System.in);

        System.out.println("Get average of 4 integers.");
        System.out.print("Number 1: ");
        double num1 = user_input.nextDouble();
        System.out.print("Number 2: ");
        double num2 = user_input.nextDouble();
        System.out.print("Number 3: ");
        double num3 = user_input.nextDouble();
        System.out.print("Number 4: ");
        double num4 = user_input.nextDouble();

        String average = String.format("%.1f", (num1 + num2 + num3 + num4) / 4);

        System.out.println("The average between " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " = " + average + ".");
    }
}
