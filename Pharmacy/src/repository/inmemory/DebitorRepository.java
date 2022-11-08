package repository.inmemory;

import domain.Customer;
import interfaces.CRUDRepository;

public class DebitorRepository implements CRUDRepository<Integer,Customer> {

    @Override
    public void add(Customer entity) {

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
