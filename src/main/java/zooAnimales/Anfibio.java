import java.util.Arraylist;

public class Anfibio extends Animal{

    private Arraylist<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){

    }

    public Anfibio( int totalAnimales, String nombre, int edad, String habitat, String genero, Arraylist<Zona> zonas,Arraylist lista, int ranas, int salamandras, String colorPiel, boolean venenoso){
        this.totalAnimales= totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        this.listado = lista;
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }
    public int cantidadAnfibios(){
        return listado.lenght();
    }

    public void movimiento(){

    }

    public crearRana(){
        Anfibio();
    }

    public crearSalamandra(){
        Anfibio();
    }
}