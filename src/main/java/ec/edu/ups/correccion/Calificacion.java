package ec.edu.ups.correccion;

public class Calificacion {
    private Asignatura asignatura;
    private Double valor;

    public Calificacion(Asignatura asignatura, Double valor) {
        this.asignatura = asignatura;
        this.valor = valor;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "asignatura=" + asignatura +
                ", valor=" + valor +
                '}';
    }
}
