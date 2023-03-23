/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class extra42 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaración de variables
        int cantidadAlumnos = 10;
        double[] notas = new double[4];
        double[][] notasAlumnos = new double[cantidadAlumnos][4];
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        // Carga de notas y cálculo de promedios
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Alumno " + (i+1) + ":");
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Ingrese la nota " + (j+1) + ": ");
                notas[j] = leer.nextDouble();
            }
            double promedio = (notas[0]*0.1) + (notas[1]*0.15) + (notas[2]*0.25) + (notas[3]*0.5);
            promedios[i] = promedio;
            notasAlumnos[i] = notas.clone();
        }

        // Cálculo de cantidad de aprobados y desaprobados
        for (double promedio : promedios) {
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Impresión de resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

        leer.close();
    }
}