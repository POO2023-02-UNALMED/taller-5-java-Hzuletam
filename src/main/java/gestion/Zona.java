public class Zona{

    private String nombre;
    private Arraylist<Zoologico> zoo=new Arraylist[1];
    private Arraylist<Animal> animales;

    public Zona(){

    }

    public Zona(String nombre,Arraylist<Zoologico> zoo,Arraylist<Animal> animales ){
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }


    public void agregarAnimales(){

    }

    public int cantidadAnimales(){
        return this.animales.lenght()
    }
}