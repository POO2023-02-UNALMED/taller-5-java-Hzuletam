import java.util.Arraylist;

public class reptil extends Animal{
    private Arraylist<Reptil> listado;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){

    }

    public Reptil(int totalAnimales,String nombre, int edad, String habitat,String genero,Arraylist<Zona> zonas, Arraylist<reptil> lista, int iguanas, int serpientes,String colorEscamas,int largoCola){
        this.totalAnimales= totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        this.listado = lista;
        this.iguanas = iguanas;
        this.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public int cantidadReptiles(){
        return listado.lenght()
    }

    public movimiento(){

    }

    public crearIguana(){
        Reptil();
    }

    public crearSerpiente(){
        reptil();
    }
}