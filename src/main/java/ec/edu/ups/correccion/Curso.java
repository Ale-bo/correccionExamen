package ec.edu.ups.correccion;

import java.util.List;

public class Curso {
    private List<Estudiante> alumnos;
    private String codigo;
    private String nombre;

    public Curso(String codigo, List<Estudiante> alumnos, String nombre) {
        this.codigo = codigo;
        this.alumnos = alumnos;
        this.nombre = nombre;
    }

    public List<Estudiante> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Estudiante> alumnos) {
        this.alumnos = alumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "alumnos=" + alumnos +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
