/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjavapoo;

import Entidades.Estudiantes;
import Servicio.EstudiantesService;

/**
 *
 * @author NET
 */
public class IntegradorJavaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiantes[] estudiantes = new Estudiantes[8];
        estudiantes[0] = new Estudiantes("Juan", 8.5);
        estudiantes[1] = new Estudiantes("Pedro", 7.0);
        estudiantes[2] = new Estudiantes("Ana", 9.0);
        estudiantes[3] = new Estudiantes("Luisa", 5.5);
        estudiantes[4] = new Estudiantes("Miguel", 6.5);
        estudiantes[5] = new Estudiantes("Lucas", 8.0);
        estudiantes[6] = new Estudiantes("María", 7.5);
        estudiantes[7] = new Estudiantes("José", 6.0);

        EstudiantesService servicio = new EstudiantesService(estudiantes);

        servicio.mostrarPromedio();

        String[] estudiantesConNotaMayor = servicio.EstudiantesConMayorNotaPromedio();
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (String nombreEstudiante : estudiantesConNotaMayor) {
            System.out.println(nombreEstudiante);
        }
    }
}