package Tema6;

import Tema6.Coche;
import Tema6.CocheCRUD;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void add(Coche coche) {
        System.out.println("ADD");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("FIND ALL");
        return null;
    }

    @Override
    public void delete(Coche coche) {
    System.out.println("DELETE");
    }
}
