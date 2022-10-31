package Domain;

public class Customer {//abstract dar nu merge in cust repo
    private String FirstName;
    private String LastName;
    private String type;
    private int ID;

    public Customer(String firstName, String lastName, String type, int ID) {
        FirstName = firstName;
        LastName = lastName;
        this.type = type;
        this.ID = ID;
    }
}
