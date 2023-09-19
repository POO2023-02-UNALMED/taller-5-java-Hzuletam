package zooAnimales;

import java.util.Arraylist;

public class Pez extends Animal{

    private static Arraylist<Pez> listado = new Arraylist<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){
        Pez.listado.add(this);

    }

    public Pez( String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);
    }

    public static int cantidadPeces(){
        return Pez.listado.size();
    }


    public static Pez crearSalmon(String nombre, int edad,String genero){
        Pez Salmon= new Pez(nombre, edad , "oceano", genero, "rojo", 6);
        Pez.salmones++;
        return Salmon;

    }


    public static Pez crearBacalao(String nombre , int edad, String genero){
        Pez Bacalao = new Pez(nombre , edad , "oceano", genero, "gris", 6);
        Pez.bacalaos++;
        return Bacalao;
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public int getCantidadAletas() {
        return this.cantidadAletas;
    }

    public movimiento(){
        return "nadar";

    }
}