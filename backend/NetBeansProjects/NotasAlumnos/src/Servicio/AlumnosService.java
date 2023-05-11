/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class AlumnosService {

 public List<Alumno> ingresarAlumno() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Alumno> AlumnoLista = new ArrayList<>();
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese el nombre del alumno:");
            String nombre = sc.next();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota " + i + " del alumno:");
                notas.add(sc.nextInt());
            }
            sc.nextLine();

            Alumno alumno = new Alumno(nombre, notas);
            AlumnoLista.add(alumno);

            System.out.println("Desea ingresar otro alumno?: s/n");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                bandera = false;
            }
        }

        return AlumnoLista;
    }

    public double notaFinal(Scanner sc, List<Alumno> AlumnoLista) {
        System.out.println("Lista de alumnos ingresados: ");
        for (Alumno alumno : AlumnoLista) {
            System.out.println(alumno.getNombre() + ": " + alumno.getNotas());
        }

        System.out.println("Ingrese el nombre del alumno para saber su nota final: ");
        String nombre = sc.next();

        for (Alumno alumno : AlumnoLista) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                List<Integer> notas = alumno.getNotas();
                double promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3.0;
                System.out.println("La nota final de " + nombre + " es: " + promedio);
                return promedio;
            }
        }

        System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
        return 0;
    }
}