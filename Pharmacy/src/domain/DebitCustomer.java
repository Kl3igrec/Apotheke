package domain;

import java.util.List;

public class DebitCustomer extends Customer{
    private List<Order> Orders;
    private int totalBudget;
    public DebitCustomer(String firstName, String lastName, String type, int ID, List<Order> orders, int totalBudget) {
        super(firstName, lastName, type, ID);
        Orders = orders;
        this.totalBudget = totalBudget;
    }


}
