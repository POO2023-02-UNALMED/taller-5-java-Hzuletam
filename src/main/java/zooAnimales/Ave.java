import java.util.Arraylist;

public class Ave extends Animal{

    private Arrraylist<Ave> listado;
    public int halcones;
    public int aguilas;
    private String  colorPlumas;


    public Ave(){

    }

    public Aves(int totalAnimales,String nombre, int edad, String habitat,String genero,Arraylist<Zona> zonas, Arraylist<Ave> lista, int halcones, int aguilas,String colorPlumas){
        this.totalAnimales= totalAnimales;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        this.listado = lista;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }

    public int cantidadAves(){
        return  listado.lenght();
    }

    public movimiento(){

    }

    public void crearHalcon(){
        Ave();
    }

    public void crearAguila() {

    }

}