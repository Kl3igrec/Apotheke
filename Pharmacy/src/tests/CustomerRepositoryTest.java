package tests;

import domain.CreditCustomer;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {
    private List<CreditCustomer> listOfExamples= new ArrayList<>();
    @BeforeEach
    public void setUP(){
        List<CreditCustomer> exampleList = new ArrayList<CreditCustomer>();
        CreditCustomer creditCustomerTester = new CreditCustomer("John","Klaus","Type 0",1);
        exampleList.add(creditCustomerTester);

    }
    @org.junit.jupiter.api.Test
    void add() {
        List<CreditCustomer> exampleList = new ArrayList<CreditCustomer>();
        CreditCustomer creditCustomerTester = new CreditCustomer("John","Klaus","Type 0",1);
        exampleList.add(creditCustomerTester);
        listOfExamples.add(creditCustomerTester);
        assertEquals(listOfExamples,exampleList);
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void findByID() {
    }
}