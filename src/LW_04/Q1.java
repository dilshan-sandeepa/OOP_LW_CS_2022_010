package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first integer: ");
        a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        b = scanner.nextInt();

        System.out.print("Enter third integer: ");
        c = scanner.nextInt();

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Smallest Number Is: " + smallest);
    }
}
