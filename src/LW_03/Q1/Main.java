package LW_03.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = sc.nextDouble();

        // Create Temperature object using parameterized constructor
        Temperature temp = new Temperature(inputCelsius);

        // Output equivalent Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());

        sc.close();
    }
}
