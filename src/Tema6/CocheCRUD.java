package Tema6;

import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {

    void add(Coche coche);

    List<Coche>findAll();

    void delete(Coche coche);

}