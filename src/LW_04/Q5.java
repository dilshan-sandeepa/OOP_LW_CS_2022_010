package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter 1 to go to Entree Menu.");
            System.out.println("Enter 2 to go to Side Dish Menu.");
            System.out.println("Enter 3 to go to Drink Menu.");
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 1 || number > 3) {
                System.out.println("Invalid number! Please enter 1, 2, or 3.\n");
            }
        } while (number < 1 || number > 3);

        if (number == 1) {
            System.out.println("\nThis is Entree Menu");
            System.out.println("=====================");
            System.out.println("Tofu Burger     $3.49");
            System.out.println("Cajun Chicken   $4.59");
            System.out.println("Buffalo Wings  $3.99");
            System.out.println("Rainbow Fillet $2.99");

        } else if (number == 2) {
            System.out.println("\nThis is Side Dish Menu");
            System.out.println("=====================");
            System.out.println("Rice Cracker   $0.79");
            System.out.println("No-Salt Fries  $0.69");
            System.out.println("Zucchini       $1.09");
            System.out.println("Brown Rice     $0.59");

        } else {
            System.out.println("\nThis is Drink Menu");
            System.out.println("===================");
            System.out.println("Cafe Mocha   $1.99");
            System.out.println("Cafe Latte   $1.90");
            System.out.println("Espresso     $2.49");
            System.out.println("Oolong Tea   $0.99");
        }
    }
}

