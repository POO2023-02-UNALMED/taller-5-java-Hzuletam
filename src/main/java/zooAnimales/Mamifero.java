import java.util.Arraylist;

public class Mamifero extends Animal{


    private Arraylist<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){

    }

    public Mamifero(int totalAnimales,String nombre, int edad, String habitat,String genero,Arraylist<Zona> zonas,Arraylist<Mamifero> lista, int caballos , int leones,boolean pelaje, int patas){
        this.totalAnimales= totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        this.listado = lista;
        int leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public int cantidadMamiferos(){

    }

    public crearMamiferos(){

    }

    public crearCaballo(){

    }

    public crearLeon(){

    }


}