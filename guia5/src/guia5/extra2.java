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
public class extra2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < 5; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < 5; i++) {
            vector2[i] = leer.nextInt();
        }
        boolean iguales = true;
        for (int i = 0; i < 5; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
        leer.close();
    }
}