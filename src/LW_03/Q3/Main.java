package LW_03.Q3;

public class Main {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle("John Doe", "555-1234");
        System.out.println("Bike 1 Owner: " + bike1.getOwnerName());


        Bicycle bike2 = new Bicycle();
        System.out.println("Bike 2 Owner: " + bike2.getOwnerName());


        bike2.setOwnerName("Jane Smith");
        System.out.println("Bike 2 New Owner: " + bike2.getOwnerName());
    }
}