import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner user_input = new Scanner(System.in);

        double sum = 0;
        int averageIntCount = 0;
        System.out.println("Get average of integers.");
        System.out.print("Enter a number: ");
        int userNumber = user_input.nextInt();
        while(userNumber != -1){
            sum += userNumber;
            averageIntCount++;
            System.out.print("Enter a number: ");
            userNumber = user_input.nextInt();
        }

        String average = String.format("%.1f", sum / averageIntCount);

        System.out.println("The average = " + average);
    }
}
