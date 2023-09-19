package gestion ;

import zooAnimales.*;
import java.util.Arraylist;

public class Zona{

    private String nombre;
    private Zoologico zoo;
    private Arraylist<Animal> animales = new Arraylist<>();

    public Zona(){

    }

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
        animal.setZona(this);

    }

    public int cantidadAnimales() {
        return this.animales.size();
    }
}