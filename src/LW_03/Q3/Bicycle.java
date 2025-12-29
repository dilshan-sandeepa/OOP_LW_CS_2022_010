package LW_03.Q3;

public class Bicycle {

    private Owner owner;

    // Constructor

    public Bicycle() {
        this.owner = new Owner("Unknown", "");
    }

    public Bicycle(String name, String num) {
        // Creates a new Owner object using the passed values
        this.owner = new Owner(name, num);
    }


    public String getOwnerName() {
        return owner.getOwnerName();
    }


    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }


    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }
}
