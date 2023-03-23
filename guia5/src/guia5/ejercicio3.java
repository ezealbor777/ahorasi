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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int[] contadores = new int[5]; // Array para contadores de 1 a 5 dígitos
      System.out.print("Ingrese los números separados por espacios: ");
      String numerosStr = leer.nextLine();
      String[] numerosArr = numerosStr.split(" ");
      
      for (int i = 0; i < numerosArr.length; i++) {
         int num = Integer.parseInt(numerosArr[i]);
         int digitos = contarDigitos(num);
         if (digitos <= 5) {
            contadores[digitos - 1]++; // Incrementar el contador correspondiente
         }
      }
      // Mostrar los resultados
      for (int i = 0; i < contadores.length; i++) {
         System.out.println("Numeros con " + (i+1) + " digitos: " + contadores[i]);
      }
   }

   // Función para contar los dígitos de un número
   public static int contarDigitos(int num) {
      int digitos = 0;
      while (num != 0) {
         digitos++;
         num /= 10;
      }
      return digitos;
   }
}