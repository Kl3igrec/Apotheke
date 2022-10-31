package Domain;

import java.util.List;

public class DebitCustomer extends Customer{
    private List<Order> Orders;
    public DebitCustomer(String firstName, String lastName, String type, int ID) {
        super(firstName, lastName, type, ID);
    }
}
