package repository.inmemory;
import domain.*;
import interfaces.CRUDRepository;

import java.util.List;

public class CreditorRepository implements CRUDRepository<Integer,Customer> {
    public List<Customer> getListOfCostumers() {
        return listOfCostumers;
    }

    public void setListOfCostumers(List<Customer> listOfCostumers) {
        this.listOfCostumers = listOfCostumers;
    }

    private List<Customer> listOfCostumers;


    @Override
    public void add(Customer entity) {
        CreditCustomer creditCustomer = new CreditCustomer("John","Klaus","Type 0",1);
        listOfCostumers.add(creditCustomer);
    }

    @Override
    public void remove(Integer integer) {

    }

    @Override
    public void update(Integer integer, Customer newEntity) {

    }

    @Override
    public Customer findByID(Integer integer) {
        return null;
    }
}
