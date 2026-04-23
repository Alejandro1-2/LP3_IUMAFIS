
package co.edu.iumafis.lang3;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int codigo;
    private int semestre;
    private double promedio;
    private boolean activo;


    public Estudiante(String nombre, int codigo, int semestre,
                      double promedio, boolean activo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.promedio = promedio;
        this.activo = activo;
    }

    public String getNombre()   { return nombre; }
    public int getCodigo()      { return codigo; }
    public int getSemestre()    { return semestre; }
    public double getPromedio() { return promedio; }
    public boolean isActivo()   { return activo; }

    
    public String getEstado() {
        if (promedio >= 4.5) {
            return "Sobresaliente";
        } else if (promedio >= 4.0) {
            return "Bueno";
        } else if (promedio >= 3.0) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
        }
    }

    @Override
    public String toString() {
        return String.format("[%d] %-15s | S%d | %.1f | %s | %s",
                codigo, nombre, semestre, promedio,
                activo ? "Activo" : "Inactivo",
                getEstado());
    }
}