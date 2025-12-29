package LW_03.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: " + temp.getCelsius());

        scanner.close();
    }
}

