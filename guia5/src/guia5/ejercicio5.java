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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      int[][] matriz = {{0, 2, -3}, {-2, 0, 4}, {3, -4, 0}}; // Ejemplo de matriz antisimétrica
      boolean esAntisimetrica = comprobarAntisimetria(matriz);
      if (esAntisimetrica) {
         System.out.println("La matriz es antisimétrica");
      } else {
         System.out.println("La matriz no es antisimétrica");
      }
   }

   public static boolean comprobarAntisimetria(int[][] matriz) {
      // Comprobar si la matriz es cuadrada
      int filas = matriz.length;
      int columnas = matriz[0].length;
      if (filas != columnas) {
         return false;
      }
      // Comprobar si la matriz es igual a su propia traspuesta
      int[][] traspuesta = new int[filas][columnas];
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            traspuesta[i][j] = matriz[j][i];
         }
      }
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            if (matriz[i][j] != traspuesta[i][j]) {
               return false;
            }
         }
      }
      // Comprobar si la matriz es igual a su propia traspuesta, pero con todos sus elementos cambiados de signo
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            if (matriz[i][j] != -traspuesta[i][j]) {
               return false;
            }
         }
      }
      // Si se han pasado todas las comprobaciones, la matriz es antisimétrica
      return true;
   }
}