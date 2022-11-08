package domain;
import java.util.*;


public class Drug {
    float price;
    Date expiryDate;
    int quantity;
    String name;

    public Drug(float price, Date expiryDate, int numberOfPills, String name) {
        this.price = price;
        this.expiryDate = expiryDate;
        quantity = numberOfPills;
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
