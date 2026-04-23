package co.edu.iumafis.lang3;
import java.util.ArrayList;


public class Main {
        //launchEjercicio1();
        //launchEjercicio2();
        //lauchEjercicio3();
        //lauchEjercicio4();
        //lauchEjercicio5();
        //lauchEjercicio6();      
    
    public static void main(String[] args) {
 
        // Crear gestor y agregar estudiantes 
        GestorEstudiantes gestor = new GestorEstudiantes();
        gestor.agregar(new Estudiante("Ana",    10001, 5, 4.5, true));
        gestor.agregar(new Estudiante("Luis",   10002, 5, 3.8, true));
        gestor.agregar(new Estudiante("Sofia",  10003, 3, 4.9, true));
        gestor.agregar(new Estudiante("Carlos", 10004, 7, 3.1, true));
 
        // Reto 1 estudiante
        System.out.println("\n=== Lista completa ===");
        gestor.listar();
 
        // Reto 2 — reportePorSemestre
        System.out.println("\n=== Reporte semestre 5 ===");
        gestor.reportePorSemestre(5);
 
        // Reto 3 — Docente
        System.out.println("\n=== Docente ===");
        Docente docente = new Docente("Carlos", 223);
 
       
        docente.asignarEstudiante(gestor.buscarPorCodigo(10001));
        docente.asignarEstudiante(gestor.buscarPorCodigo(10002));
        docente.asignarEstudiante(gestor.buscarPorCodigo(10003));
 
        docente.listarGrupo();
 
        Estudiante mejor = docente.mejorEstudiante();
        if (mejor != null) {
            System.out.println("Mejor estudiante:");
            System.out.println(mejor);
        } else {
            System.out.println("No hay estudiantes");
        }
    }

        /* --------------------------------------------------------------------------  */
 
   /*  multiples clases main que correo el ejemplo estudiante y gestor
 
 public class Main {

    public static void main(String[] args) {

        GestorEstudiantes gestor = new GestorEstudiantes();

        // ── Poblar el sistema ─────────────────────────────────────────
        gestor.agregar(new Estudiante("Laura Gómez",   20241001, 5, 4.2, true));
        gestor.agregar(new Estudiante("Andrés Ríos",   20241002, 3, 2.8, true));
        gestor.agregar(new Estudiante("Camila Torres", 20241003, 5, 3.9, true));
        gestor.agregar(new Estudiante("Diego Muñoz",   20241004, 4, 1.7, false));
        gestor.agregar(new Estudiante("Sofía Herrera", 20241005, 6, 4.8, true));

        // ── Listar todos ───────────────────────────────────────────────
        System.out.println("\n=== TODOS LOS ESTUDIANTES ===");
        gestor.listar();

        // ── Buscar por código ──────────────────────────────────────────
        System.out.println("\n=== BUSCAR ===");
        Estudiante encontrado = gestor.buscarPorCodigo(20241003);
        if (encontrado != null)
            System.out.println("Encontrado: " + encontrado);
        else
            System.out.println("No encontrado");

        // ── Listar aprobados ───────────────────────────────────────────
        System.out.println("\n=== APROBADOS Y ACTIVOS ===");
        ArrayList<Estudiante> aprobados = gestor.obtenerAprobados();
        for (Estudiante e : aprobados) System.out.println("  ✓ " + e);

        // ── Promedio general ───────────────────────────────────────────
        System.out.printf("%n=== ESTADÍSTICAS ===%n");
        System.out.printf("Promedio general del grupo: %.2f%n", gestor.promedioGeneral());
        System.out.println("Aprobados: " + aprobados.size() + "/" + 5);
    }
 

 */
    private static void lauchEjercicio6() {

        
        ArrayList<String> estudiantes = new ArrayList<>();
        ArrayList<Double> promedios    = new ArrayList<>();
        // Double (con D mayúscula) es el "wrapper" de double para usar en colecciones

        estudiantes.add("Laura");  promedios.add(4.2);
        estudiantes.add("Andrés"); promedios.add(2.8);
        estudiantes.add("Camila"); promedios.add(3.5);
        estudiantes.add("Diego");  promedios.add(1.9);
        estudiantes.add("Sofía");  promedios.add(4.7);

        System.out.println("=== REPORTE DE NOTAS ===");
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < estudiantes.size(); i++) {
            String nombre   = estudiantes.get(i);
            double promedio = promedios.get(i);

            String estado = (promedio >= 3.0) ? "✓ APROBADO" : "✗ REPROBADO";
            // ↑ operador ternario: condición ? valor_si_true : valor_si_false

            System.out.printf("  %-10s  %.1f  %s%n", nombre, promedio, estado);

            if (promedio >= 3.0) aprobados++;
            else                  reprobados++;
        }

        System.out.printf("%nAprobados: %d | Reprobados: %d%n", aprobados, reprobados);
    }

    private static void lauchEjercicio5() {

        // ArrayList<Tipo> — el tipo va entre < > (genérico)
        ArrayList<String> nombres = new ArrayList<>();

        // add() agrega al final de la lista
        nombres.add("Laura Gómez");
        nombres.add("Andrés Ríos");
        nombres.add("Camila Torres");
        nombres.add("Diego Muñoz");

        System.out.println("Total estudiantes: " + nombres.size());  // size() → cantidad
        System.out.println("Primero: " + nombres.get(0));          // índice comienza en 0
        System.out.println("Último : " + nombres.get(nombres.size() - 1));
        
        // ── Forma 1: for-each — cuando solo necesitas el valor ────────
        System.out.println("--- Lista de estudiantes ---");
        for (String nombre : nombres) {     // lee: "para cada nombre en nombres"
            System.out.println("  • " + nombre);
        }

        // ── Forma 2: for clásico — cuando necesitas el índice ─────────
        System.out.println("--- Con numeración ---");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("  %d. %s%n", i + 1, nombres.get(i));
        }
        // i=0 → inicio  |  i < size() → condición  |  i++ → incremento
        
        // ── Buscar ────────────────────────────────────────────────────
        boolean existe = nombres.contains("Andrés Ríos");   // true/false
        int     pos    = nombres.indexOf("Andrés Ríos");    // -1 si no existe
        System.out.println("¿Existe? " + existe + " en posición " + pos);

        // ── Modificar ─────────────────────────────────────────────────
        nombres.set(1, "Andrés Ríos Peña");     // reemplaza posición 1

        // ── Eliminar ──────────────────────────────────────────────────
        nombres.remove("Diego Muñoz");          // elimina por valor
        nombres.remove(0);                     // elimina por índice (int)

        System.out.println("Después de eliminar: " + nombres);
        System.out.println("Tamaño: " + nombres.size());

        // ── Verificar vacía y limpiar ─────────────────────────────────
        if (!nombres.isEmpty()) {
            System.out.println("La lista tiene " + nombres.size() + " elementos");
        }
        nombres.clear();     // elimina TODOS los elementos
    }

    private static void lauchEjercicio4() {

        
        String nombre = "laura gomez";
        double promedio = 3.6;
        boolean activo = true;
        int semestre = 5;
        int materias = 4;
        int maxMat = 6;
        
        if (activo && promedio >= 3.0 && materias <= maxMat) {
            System.out.println(nombre + ": inscripcion  AUTORIZADA");
            System.out.printf("promedio %.1f | Semestre: %d | Materias: %d%n", promedio, semestre, materias );
        }else if ( !activo ){
            System.out.println(nombre + ": RECHAZADA - estudiante inactivo");
        }else if (promedio < 3.0){
            System.out.println(nombre + ": RECHAZADA promedio insuficiente ("+ promedio +")");
        }else{
            System.out.println(nombre + "RECHAZADA - excede maximo de materias");
        }
    }

    private static void lauchEjercicio3() {

        int semestre1 = 5;

        String ciclo = switch (semestre1) {
            case 1, 2 ->
                "ciclo basico";
            case 3, 4 ->
                "ciclo intermedio";
            case 5, 6 ->
                "ciclo profesional";
            case 7, 8 ->
                "ciclo de profundizacion";
            case 9, 10 ->
                "ciclo de grado";
            default ->
                "semestre no valido";

        };

        System.out.println("Semestre " + semestre1 + ":" + ciclo);

        switch (semestre1) {
            case 1: case 2:
                System.out.println("ciclo basico");
                break;
            case 5:
                System.out.println("ciclo profesional");
                break;
            default:
                System.out.println("otro semestre");
                
                
        }
    }

    private static void launchEjercicio2() {
        ///////////////////////////////////////////////////////////////
        
        double nota = 3.8;
        String estado;
        
        if (nota >= 4.5) {
            estado = "sobresaliente";
        }
        if (nota >= 4.0) {
            estado = "bueno";
        }
        if (nota >= 3.0) {
            estado = "aprobado";
        } else {
            estado = "reprobado";
        }
        
        System.out.println("Nota:" + nota + "->" + estado);
    }

    private static void launchEjercicio1() {
        String nombre = "Jose Alejandro";
        int codigo = 1;
        int semestre = 5;
        double promedio = 4.4;
        boolean activo = true;
        
        IO.println("su nombre es:" + nombre);
        IO.println("Su codigo es:" + codigo);
        IO.println("su semestre es :" + semestre);
        IO.println("su promedio:" + promedio);
        IO.println("activo:" + activo);
        System.out.printf("Promedio formateado: %.2f%n", promedio);
    }

}