package LW_04;

import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        int target = random.nextInt(100) + 1;
        int guess;

        System.out.println("\nI have generated a number between 1 and 100. Try to guess it!");


        do {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();

            if (guess < target) {
                System.out.println("Higher! Try again.");
            } else if (guess > target) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You guessed correct number: " + target);
            }

        } while (guess != target);
    }
}

