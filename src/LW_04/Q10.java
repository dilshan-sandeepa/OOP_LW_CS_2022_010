package LW_04;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        boolean isPalindrome = true;
        int len = cleanedInput.length();

        for (int i = 0; i < len / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}

