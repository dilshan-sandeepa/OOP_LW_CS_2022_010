package LW_04;
import java.util.Scanner;

public class Q7 {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int digits = 0;
        while (number > 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter integer (negative to stop): ");
            input = scanner.nextInt();

            if (input < 0) {
                System.out.println("the Program terminated.");
                break;
            }

            int numDigits = countDigits(input);
            System.out.println("The number " + input + " has " + numDigits + " digits.");
        }
    }
}
