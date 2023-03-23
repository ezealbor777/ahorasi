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
public class extra1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Pedimos al usuario que ingrese el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        // Creamos el vector
        int[] vector = new int[n];
        
        // Pedimos al usuario que ingrese los valores del vector
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            vector[i] = leer.nextInt();
        }
        
        // Calculamos la suma de los elementos del vector
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        // Mostramos el resultado
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}