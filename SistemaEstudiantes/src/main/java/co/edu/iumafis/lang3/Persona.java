package co.edu.iumafis.lang3;

// Clase base para evitar repetir nombre e id en Estudiante y Docente
public abstract class Persona {
    String nombre;
    int id;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public abstract String toString();
}
