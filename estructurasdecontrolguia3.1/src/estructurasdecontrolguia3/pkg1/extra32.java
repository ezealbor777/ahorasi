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
public class extra32 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        String letra = leer.next();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")
                || letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " es una consonante");
        }
    }
}