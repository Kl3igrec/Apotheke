package Repository;
import Domain.*;

import java.util.List;

public class CustomerRepository implements CRUDRepository<Integer,Customer>{

    private List<Customer> Customers;
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
