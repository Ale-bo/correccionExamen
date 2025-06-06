package ec.edu.ups.correccion;
import java.util.List;

public class Estudiante {
    private String celdula;
    private List<Calificacion> calificaciones;
    private String apellido;
    private String nombre;

    public Estudiante(String apellido, List<Calificacion> calificaciones, String celdula, String nombre) {
        this.apellido = apellido;
        this.calificaciones = calificaciones;
        this.celdula = celdula;
        this.nombre = nombre;
    }

    public Estudiante() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getCeldula() {
        return celdula;
    }

    public void setCeldula(String celdula) {
        this.celdula = celdula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "apellido='" + apellido + '\'' +
                ", celdula='" + celdula + '\'' +
                ", calificaciones=" + calificaciones +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
