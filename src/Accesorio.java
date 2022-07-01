public class Accesorio extends Producto {
    String tipo;
    String animal;
    public  Accesorio(int id, String nombre, double Precio,String tipo, String animal){
        super(id,nombre,Precio);
        this.tipo=tipo;
        this.animal=animal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAnimal() {
        return animal;
    }
}
