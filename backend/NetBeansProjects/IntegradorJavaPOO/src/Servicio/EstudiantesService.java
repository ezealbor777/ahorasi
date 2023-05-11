/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Estudiantes;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author NET
 */
public class EstudiantesService {
    
    private Estudiantes[] estudiantes;
    private double promedio;

    public EstudiantesService(Estudiantes[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Método para calcular el promedio de notas del curso
    public double calcularPromedio() {
        double suma = 0;
        for (Estudiantes estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        promedio = suma / estudiantes.length;
        return promedio;
    }

    // Método para obtener los estudiantes con una nota mayor al promedio
    public String[] EstudiantesConMayorNotaPromedio() {
        List<String> nombresEstudiantes = new ArrayList<String>();
        calcularPromedio(); // Llamada al método para calcular el promedio
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresEstudiantes.add(estudiante.getNombre());
            }
        }
        return nombresEstudiantes.toArray(new String[nombresEstudiantes.size()]);
    }

    // Método para mostrar el promedio de notas del curso
    public void mostrarPromedio() {
        calcularPromedio(); // Llamada al método para calcular el promedio
        System.out.println("El promedio de notas del curso es: " + promedio);
    }
}

