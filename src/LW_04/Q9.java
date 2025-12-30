package LW_04;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }


            for (int t = 1; t <= 2 * i - 1; t++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
