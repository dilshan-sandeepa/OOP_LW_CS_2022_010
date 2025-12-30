package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a power of 10 (6, 9, 12, 15, 18, 21, 30, 100): ");
        int power = scanner.nextInt();

        String name;

        switch (power) {
            case 6:
                name = "Million";
                break;
            case 9:
                name = "Billion";
                break;
            case 12:
                name = "Trillion";
                break;
            case 15:
                name = "Quadrillion";
                break;
            case 18:
                name = "Quintillion";
                break;
            case 21:
                name = "Sextillion";
                break;
            case 30:
                name = "Nonillion";
                break;
            case 100:
                name = "Googol";
                break;
            default:
                name = null;
        }

        if (name != null) {
            System.out.println(power + "th power of 10 is called " + name + ".");
        } else {
            System.out.println(power + "th power of 10 has no corresponding word.");
        }
    }
}
