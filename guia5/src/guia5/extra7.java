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
public class extra7 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci que desea generar: ");
        int n = leer.nextInt();

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

}