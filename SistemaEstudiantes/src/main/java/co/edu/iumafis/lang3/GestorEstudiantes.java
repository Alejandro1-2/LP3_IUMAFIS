package co.edu.iumafis.lang3;
import java.util.ArrayList;



public class GestorEstudiantes {

    // ejemplo multiples clases gestor estudiante
    // Lista interna de objetos Estudiante
    private ArrayList<Estudiante> lista = new ArrayList<>();

    // ── AGREGAR ────────────────────────────────────────────────────
    public void agregar(Estudiante e) {
        lista.add(e);
        System.out.println("✓ Agregado: " + e.getNombre());
    }

    // ── LISTAR TODOS ───────────────────────────────────────────────
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("  (lista vacía)");
            return;
        }
        System.out.println("Código | Nombre          | Sem | Prom | Estado");
        System.out.println("─".repeat(55));
        for (Estudiante e : lista) {
            System.out.println(e);   // llama a toString() automáticamente
        }
        System.out.println("Total: " + lista.size() + " estudiante(s)");
    }

    // ── BUSCAR POR CÓDIGO ──────────────────────────────────────────
    public Estudiante buscarPorCodigo(int codigo) {
        for (Estudiante e : lista) {
            if (e.getCodigo() == codigo) return e;
        }
        return null;   // null = "no encontrado"
    }

    // ── FILTRAR APROBADOS ──────────────────────────────────────────
    public ArrayList<Estudiante> obtenerAprobados() {
        ArrayList<Estudiante> resultado = new ArrayList<>();
        for (Estudiante e : lista) {
            if (e.getPromedio() >= 3.0 && e.isActivo()) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    // ── CALCULAR PROMEDIO GENERAL ──────────────────────────────────
    public double promedioGeneral() {
        if (lista.isEmpty()) return 0.0;
        double suma = 0.0;
        for (Estudiante e : lista) suma += e.getPromedio();
        return suma / lista.size();
    }

    // ── ELIMINAR POR CÓDIGO ────────────────────────────────────────
    public boolean eliminar(int codigo) {
        Estudiante encontrado = buscarPorCodigo(codigo);
        if (encontrado != null) {
            lista.remove(encontrado);
            System.out.println("✓ Eliminado: " + encontrado.getNombre());
            return true;
        }
        System.out.println("✗ Código " + codigo + " no encontrado");
        return false;
    }
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////
    // Reto 2
    public void reportePorSemestre(int semestre) {
        int    contador = 0;
        double suma     = 0;

        for (Estudiante estudiante : lista) {
            if (estudiante.getSemestre() == semestre) {
                System.out.println(estudiante);
                suma += estudiante.getPromedio();
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay estudiantes en ese semestre");
        } else {
            double promedioGrupal = suma / contador;
            System.out.println("Cantidad de estudiantes: " + contador);
            System.out.println("Promedio grupal: " + promedioGrupal);
        }
    }
}


