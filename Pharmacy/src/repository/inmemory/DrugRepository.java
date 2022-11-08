package repository.inmemory;
import domain.Drug;
import interfaces.CRUDRepository;

public class DrugRepository implements CRUDRepository<String,Drug> {
    @Override
    public void add(Drug entity) {

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public void update(String s, Drug newEntity) {

    }

    @Override
    public Drug findByID(String s) {
        return null;
    }
}
