package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get outer and inner radius:
        System.out.println("Enter outer-circle radius: ");
        double outerCircleRadius = scanner.nextDouble();

        System.out.println("Enter inner-circle radius: ");
        double innerCircleRadius = scanner.nextDouble();

        Circle outerCircle = new Circle(outerCircleRadius);
        Circle innerCircle = new Circle(innerCircleRadius);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();

        double outer_Cir = outerCircle.computeCircumference();
        double inner_Cir = innerCircle.computeCircumference();

        double shadeArea = outerCircleArea - innerCircleArea;

        System.out.println("Circumferences of the outer circle: " + outer_Cir + " and " + " inner circle : " + inner_Cir);
        System.out.println("Shaded Area : " + shadeArea);
    }


}
