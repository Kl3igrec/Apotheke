package domain;

public class Customer {
    private String firstName;
    private String lastName;
    private String type;
    private int ID;
    public Customer(String firstName, String lastName, String type, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.ID = ID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }




}