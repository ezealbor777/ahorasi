/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;






/**
 *
 * @author NET
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        char[][] sopaDeLetras = new char[20][20];

        // Leer las palabras del usuario
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
            palabras[i] = leer.next().toUpperCase();

            // Verificar que la palabra tenga entre 3 y 5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese otra vez: ");
                palabras[i] = leer.next().toUpperCase();
            }
        }

        // Seleccionar una fila aleatoria para ubicar las palabras
        int fila = aleatorio.nextInt(20);

        // Ubicar las palabras en la fila seleccionada
        int x = aleatorio.nextInt(20 - palabras.length + 1);
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[fila][x + j] = palabra.charAt(j);
            }
            x += palabra.length() + 1;
        }

        // Rellenar los espacios vacíos con números aleatorios
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                if (sopaDeLetras[i][j] == '\u0000') {
                    sopaDeLetras[i][j] = (char) (aleatorio.nextInt(10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }

    }

}

