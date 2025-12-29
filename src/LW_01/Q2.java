package LW_01;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fname ;
        String mname ;
        String lname ;

        System.out.print("Enter the first name : ");
        fname = scanner.next();
        System.out.print("Enter the middle name : ");
        mname = scanner.next() ;
        System.out.print("Enter the last name : ");
        lname = scanner.next() ;

        System.out.println("Name : "+ lname +","+fname +" "+ mname.charAt(0));
        // System.out.println(lastName+", "+firstName+" "+ middleName.substring(0,1) +".");

    }
}


