public class Zoologico{
    private String nombre;
    private String Ubicacion;
    private Arraylist<Zona> zonas;

    public Zoologico(){

    }

    public Zoologico(String nombre,String ubicacion,Arraylist<Zona> zonas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas =  zonas;
    }

    public void agregarZonas(Arraylist<Zona> zonas){
        for zona:zonas{
            this.zonas.append(zonas)
        }

    }
}