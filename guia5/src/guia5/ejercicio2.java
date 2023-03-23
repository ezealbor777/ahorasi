/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author NET
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el vector con tamaño 100
        int[] numeros = new int[100];
        
        // Llenamos el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = 100 - i;
        }
        
        // Mostramos los números en orden descendente
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}