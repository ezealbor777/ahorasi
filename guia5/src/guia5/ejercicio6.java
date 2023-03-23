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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario el tamaño de la matriz
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = sc.nextInt();
        
        // Pedir al usuario los números de la matriz
        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los números de la matriz:");
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // Verificar si la matriz es cuadrada
        if(filas != columnas) {
            System.out.println("La matriz no es cuadrada.");
            return;
        }
        
        // Transponer la matriz original
        int[][] traspuesta = new int[filas][columnas];
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        // Verificar si la matriz es antisimétrica
        boolean antisimetrica = true;
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                if(matriz[i][j] != -traspuesta[i][j]) {
                    antisimetrica = false;
                    break;
                }
            }
            if(!antisimetrica) {
                break;
            }
        }
        
        // Imprimir el resultado
        if(antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }

    }

}