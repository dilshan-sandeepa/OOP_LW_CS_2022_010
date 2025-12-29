package LW_02;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();


        sentence = sentence.toLowerCase();


        StringTokenizer tokenizer = new StringTokenizer(sentence);

        StringBuilder cleaned = new StringBuilder();


        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            word = word.replaceAll("[^a-z]", "");
            cleaned.append(word);
        }


        String original = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("Sentence is a palindrome.");
        } else {
            System.out.println("Sentence is not a palindrome.");
        }

        sc.close();
    }
}
