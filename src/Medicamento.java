public class Medicamento extends Producto{
    public String getTipo() {
        return tipo;
    }

    public String getAnimal() {
        return animal;
    }

    String tipo;
    String animal;
    public  Medicamento(int id, String nombre, double Precio,String tipo, String animal){
        super(id,nombre,Precio);
        this.tipo=tipo;
        this.animal=animal;
    }
}
