public class Producto {
   int id;
    double Precio;
    String nombre;

    public double getPrecio() {
        return Precio;
    }
    public String getNombre() {
        return nombre;
    }
 public Producto(int id, String nombre, double Precio){
        this.id=id;
        this.Precio=Precio;
        this.nombre=nombre;
 }

}
