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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 1; i <= 4; i++) {
            do {
                System.out.print("Introduce el número " + i + " (entre 1 y 20): ");
                num = leer.nextInt();
            } while (num < 1 || num > 20);

            System.out.print(num + ": ");
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}