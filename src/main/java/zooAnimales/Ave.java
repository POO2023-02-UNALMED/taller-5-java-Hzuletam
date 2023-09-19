package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{

    private static ArrrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String  colorPlumas;


    public Ave(){
        Ave.listado.add(this);

    }

    public Ave(String nombre, int edad, String habitat,String genero,String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }

    public static int cantidadAves(){
        return  Ave.listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad,String genero){
        Ave Halcon = new Ave(nombre, edad , "montanas", genero, "cafe glorioso");
        Ave.halcones++;
        return Halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave Aguila = new Ave(nombre , edad, "montanas", genero, "blanco y amarillo");
        Ave.aguilas++;
        return Aguila;

    }

    public String movimiento(){
        return "volar";
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }
}