package co.edu.iumafis.lang3;

public class Estudiante extends Persona {
    int semestre;
    double promedio;

    public Estudiante(String nombre, int id, int semestre, double promedio) {
        super(nombre, id);
        this.semestre = semestre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " | ID: " + id + " | Prom: " + promedio;
    }
}

    
    /*
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
    
    
    */




/* multiple clase 1

public class Estudiante {

    // ── Atributos (campos) ─────────────────────────────────────────
    // private: solo accesibles dentro de esta clase (encapsulamiento)
    private String  nombre;
    private int     codigo;
    private int     semestre;
    private double  promedio;
    private boolean activo;

    // ── Constructor ────────────────────────────────────────────────
    // Método especial: mismo nombre que la clase, sin tipo de retorno
    // Se llama con "new Estudiante(...)" y establece el estado inicial
    public Estudiante(String nombre, int codigo, int semestre,
                       double promedio, boolean activo) {
        this.nombre   = nombre;    // "this" distingue atributo de parámetro
        this.codigo   = codigo;
        this.semestre = semestre;
        this.promedio = promedio;
        this.activo   = activo;
    }

    // ── Getters — métodos que devuelven el valor de un atributo ────
    public String  getNombre()   { return nombre;   }
    public int     getCodigo()   { return codigo;   }
    public int     getSemestre() { return semestre; }
    public double  getPromedio() { return promedio; }
    public boolean isActivo()    { return activo;   }

    // ── Setter — modificar el promedio después de creación ─────────
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0)  // validación en el setter
            this.promedio = promedio;
    }

    // ── toString — representación textual del objeto ───────────────
    // Se llama automáticamente cuando usas el objeto en un println
    @Override
    public String toString() {
        return String.format("[%d] %-15s | S%d | %.1f | %s",
               codigo, nombre, semestre, promedio,
               activo ? "Activo" : "Inactivo");
    }
}

*/