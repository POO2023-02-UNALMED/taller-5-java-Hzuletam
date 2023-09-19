import java.util.Arraylist;

public class Anfibio extends Animal{

    private static Arraylist<Anfibio> listado = new Arraylist<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
    Anfibio.listado.add(this);
    }

    public Anfibio( String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        Anfibio.listado.add(this);
    }
    public int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    public String movimiento(){

    }

    public static Anfibio crearRana(String nombre, int edad , String genero ){

        Anfibio Rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        Anfibio.ranas++;
        return Rana;

    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){

        Anfibio Salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        Anfibio.salamandras++;
        return Salamandra;
    }

    public String getColorPiel() {
        return this.colorPiel;
    }

    public boolean isVenenoso() {
        return this.venenoso;
    }

    public String movimiento(){
        return "saltar";
    }
}