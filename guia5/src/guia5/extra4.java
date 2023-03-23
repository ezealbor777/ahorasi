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
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadDeAlumnos = 10;
        double[] promedios = new double[cantidadDeAlumnos];
        int aprobados = 0;
        int desaprobados = 0;
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cantidadDeAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            double nota1 = leer.nextDouble() * 0.1;
            double nota2 = leer.nextDouble() * 0.15;
            double nota3 = leer.nextDouble() * 0.25;
            double nota4 = leer.nextDouble() * 0.5;
            double promedio = nota1 + nota2 + nota3 + nota4;
            promedios[i] = promedio;
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}