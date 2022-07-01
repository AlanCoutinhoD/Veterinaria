import java.util.Date;

public class ExpedienteClinico  extends Mascota{
   protected String estado,vacunas;
   protected double peso;
   protected Date fecha= new Date();

    public String getEstado() {
        return estado;
    }

    public String getVacunas() {
        return vacunas;
    }

    public double getPeso() {
        return peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getFolio() {
        return folio;
    }

    protected int folio;
    public ExpedienteClinico(int id, String nombre,int edad,String tipo,String genero,String estado,double peso, String vacunas,Date fecha){
    super(id,nombre,edad,tipo,genero);
    this.estado= estado;
    this.peso= peso;
    this.vacunas= vacunas;
    this.fecha = fecha;
    }
}
