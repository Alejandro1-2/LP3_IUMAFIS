/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.lang3;

/**
 *
 * @author 10jos
 */
class Inscripcion {
    Estudiante estudiante;
    Materia materia;
    double nota;

    public Inscripcion(Estudiante e, Materia m, double n) {
        this.estudiante = e;
        this.materia = m;
        this.nota = n;
    }

    public String toString() {
        return estudiante.nombre + " inscrito en " + materia.nombre + " con nota: " + nota;
    }
}
