import java.util.Arraylist;

public class Pez extends Animal{

    private Arraylist<Pez> listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){

    }

    public Pez( int totalAnimales, String nombre, int edad, String habitat, String genero, Arraylist<Zona> zonas, Arraylist<Pez> lista, int salmones, int bacalaos, String colorEscamas, int cantidadAletas){
        this.totalAnimales= totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        this.listado = lista;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public int cantidadPeces(){
        return listado.lenght
    }


    public movimiento(){

    }

    public crearSalmon(){
        Pez();
    }


    public crearBacalao(){
        Pez();
    }
}