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
public class ejerecicio4 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
      int[][] matriz = new int[4][4]; // Matriz de 4x4
      Random leer = new Random();
      // Inicializar la matriz con valores aleatorios
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            matriz[i][j] = leer.nextInt(10);
         }
      }
      // Mostrar la matriz original
      System.out.println("Matriz original:");
      mostrarMatriz(matriz);
      // Mostrar la traspuesta de la matriz
      int[][] traspuesta = new int[4][4]; // Matriz traspuesta
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            traspuesta[i][j] = matriz[j][i];
         }
      }
      System.out.println("Matriz traspuesta:");
      mostrarMatriz(traspuesta);
   }

   // Función para mostrar una matriz en la consola
   public static void mostrarMatriz(int[][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
      }
   }
}


