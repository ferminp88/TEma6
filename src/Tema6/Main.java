package Tema6;


public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUDImpl = new CocheCRUDImpl();

        Coche coche = new Coche("FORD","FOCUS",5,180);

        cocheCRUDImpl.add(new Coche(coche));
        cocheCRUDImpl.findAll();
        cocheCRUDImpl.delete(coche);

    }
}