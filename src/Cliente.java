public class Cliente {

    private int telefono,id;
    private String nombre;
    public Cliente(int id , String nombre, int telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        this.id=id;

    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente() {

    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
