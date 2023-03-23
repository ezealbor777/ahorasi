/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrolguia3.pkg1;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;

        System.out.print("Introduce una palabra o frase: ");
        palabra = leer.nextLine();

        if (palabra.charAt(0) == 'A' || palabra.charAt(0) == 'a') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}