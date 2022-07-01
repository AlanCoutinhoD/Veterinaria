import java.util.ArrayList;

public class Mascota {
    ArrayList<ExpedienteClinico> ExpedienteClinico=new ArrayList<>();
    protected String nombre,genero,tipo;
    protected int edad,id;

    public int getId() {
        return id;
    }

    public Mascota(int id, String nombre, int edad, String tipo, String genero) {
        this.id=id;
        this.nombre= nombre;
        this.edad=edad;
        this.tipo=tipo;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
