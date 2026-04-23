package co.edu.iumafis.lang3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GestorEstudiantesTest {

    private GestorEstudiantes gestor;    // atributo compartido por todas las pruebas
    private Estudiante         est1;

    @BeforeEach                            // se ejecuta ANTES de cada @Test
    void setUp() {
        gestor = new GestorEstudiantes();
        est1   = new Estudiante("Laura Gómez", 20241001, 5, 4.2, true);
    }

    @Test
    @DisplayName("Agregar un estudiante incrementa el total en 1")
    void agregar_unEstudiante_totalAumentaEnUno() {
        gestor.agregar(est1);
        assertEquals(1, gestor.getTotalEstudiantes());
    }

    @Test
    @DisplayName("Lista vacía retorna total 0")
    void listaVacia_total_esZero() {
        assertEquals(0, gestor.getTotalEstudiantes());
        // gestor fue reiniciado por @BeforeEach — siempre comienza vacío
    }
}