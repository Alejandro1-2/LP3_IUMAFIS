package co.edu.iumafis.lang3;
import java.util.ArrayList;

public class GestorEstudiantes {

    private ArrayList<Estudiante> lista;

    public GestorEstudiantes() {
        this.lista = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        lista.add(e);
    }

    public void listar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("  [" + (i+1) + "] " + lista.get(i));
        }
    }

    public Estudiante get(int indice) {
        return lista.get(indice);
    }

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