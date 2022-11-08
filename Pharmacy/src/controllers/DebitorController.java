package controllers;

import interfaces.ControllerInterface;
import repository.inmemory.DebitorRepository;

import java.util.List;

public class DebitorController implements ControllerInterface<DebitorRepository> {
    @Override
    public List<DebitorRepository> getAll() {
        return null;
    }

    @Override
    public List<DebitorRepository> sortedByName() {
        return null;
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }
}
