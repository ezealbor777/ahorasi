/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;

/**
 *
 * @author NET
 */
public class extra5 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // Definimos el tamaño de la matriz
        int n = 5;
        int m = 3;

        // Creamos la matriz y la llenamos con valores aleatorios
        int[][] matriz = new int[n][m];
        Random aleatorio = new Random();
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
                suma += matriz[i][j];
            }
        }

        // Mostramos la matriz y la suma de sus elementos
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de los elementos: " + suma);
    }
}