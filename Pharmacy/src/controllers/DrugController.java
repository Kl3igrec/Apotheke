package controllers;

import domain.Drug;
import interfaces.ControllerInterface;

import java.util.List;

public class DrugController implements ControllerInterface<Drug> {
    @Override
    public List<Drug> getAll() {
        return null;
    }

    @Override
    public List<Drug> sortedByName() {
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
