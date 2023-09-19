package gestion;
import java.util.Arraylist;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private Arraylist<Zona> zonas = new Arraylist<>();

    public Zoologico(){

    }

    public Zoologico(String nombre,String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
        zona.setZoo(this);

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public Arraylist<Zona> getZona(){
        return this.zonas;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int cantidadTotalAnimales(){
        int i = 0;
        for( Zona zona : zonas){
            i += zona.cantidadAnimales();
        }
        return i;
    }
}