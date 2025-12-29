package LW_01;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.print("Enter a odd-length word:");
        String word=scan.nextLine();

        int length=word.length();

        if(length%2==1) {
            System.out.println(word.substring(length / 2, (length / 2) + 1));
            //System.out.println(word.charAt(length/2));

        }else {
            System.out.println("The word must have an odd length.");
        }

    }


}
