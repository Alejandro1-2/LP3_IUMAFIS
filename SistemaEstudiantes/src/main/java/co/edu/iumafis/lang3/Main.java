package co.edu.iumafis.lang3;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //launchEjercicio1();
        //launchEjercicio2();
        //lauchEjercicio3();
        //lauchEjercicio4();
        //lauchEjercicio5();
  
    
    
    }

    private static void lauchEjercicio5() {

        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("samuelito Orrego");
        nombres.add("Alejandro Tobon");
        nombres.add("Santiago Lopez");
        nombres.add("Tomenos Diaz");
        
        System.out.println("Total estudiantes:" + nombres.size());
        System.out.println("Primero:" + nombres.get (0));
        System.out.println("ultimo: " + nombres.get (nombres.size()-1));
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
