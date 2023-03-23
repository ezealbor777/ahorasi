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
public class extra41 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Declaración de variables
        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        // Carga de notas y cálculo de promedios
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Alumno " + (i+1) + ":");
            System.out.print("Ingrese la nota del primer trabajo práctico evaluativo (10%): ");
            double nota1 = leer.nextDouble();
            System.out.print("Ingrese la nota del segundo trabajo práctico evaluativo (15%): ");
            double nota2 = leer.nextDouble();
            System.out.print("Ingrese la nota del primer integrador (25%): ");
            double nota3 = leer.nextDouble();
            System.out.print("Ingrese la nota del segundo integrador (50%): ");
            double nota4 = leer.nextDouble();

            double promedio = (nota1*0.1) + (nota2*0.15) + (nota3*0.25) + (nota4*0.5);
            promedios[i] = promedio;
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