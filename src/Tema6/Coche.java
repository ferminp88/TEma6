package Tema6;

public class Coche {

    String fabricante;
    String modelo;
    int cantPuertas;
    int velMaxima;


    public Coche(Coche coche){};


    public Coche(String fabricante, String modelo, int cantPuertas, int velMaxima){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cantPuertas = cantPuertas;
        this.velMaxima = velMaxima;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantPuertas=" + cantPuertas +
                ", velMaxima=" + velMaxima +
                '}';
        }
}

