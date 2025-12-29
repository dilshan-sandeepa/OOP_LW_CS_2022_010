package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int feet;
        double centimeter;
        double inches;

        System.out.print("Enter Centimeter value: ");
        centimeter = scan.nextFloat();

        inches=centimeter/2.54;
        feet=(int) (inches/12);
        inches=inches-(feet*12);

        System.out.println(feet + " feet, " + inches + " inches.");


    }
}