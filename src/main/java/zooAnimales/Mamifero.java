package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{


    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
        Mamifero.listado.add(this);

    }

    public Mamifero(String nombre, int edad, String habitat,String genero, boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }

    public static int cantidadMamiferos(){
        return this.listado.size();

    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){

        Mamifero Caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos++;
        return Caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero Leon = new Mamifero(nombre, edad, "selva", true, 4);
        Mamifero.leones++;
        return Leon;

    }

    public boolean isPelaje() {
        return this.pelaje;
    }

    public int getPatas() {
        return this.patas;
    }
}