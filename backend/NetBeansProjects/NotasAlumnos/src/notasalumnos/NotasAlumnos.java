/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalumnos;

import Entidades.Alumno;
import Servicio.AlumnosService;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlumnosService servicio = new AlumnosService();

        List<Alumno> AlumnoLista = servicio.ingresarAlumno();
        servicio.notaFinal(sc, AlumnoLista);
    }
}