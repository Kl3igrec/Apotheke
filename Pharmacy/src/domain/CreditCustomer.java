package domain;

import java.util.List;

public class CreditCustomer extends Customer {
    private List<Order> newItems;

    public CreditCustomer(String firstName, String lastName, String type, int ID) {
        super(firstName, lastName, type, ID);
    }


}
