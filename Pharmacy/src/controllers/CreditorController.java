package controllers;

import interfaces.ControllerInterface;

import java.util.List;

public class CreditorController implements ControllerInterface<CreditorController> {

    @Override
    public List<CreditorController> getAll() {
        return null;
    }

    @Override
    public List<CreditorController> sortedByName() {
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
