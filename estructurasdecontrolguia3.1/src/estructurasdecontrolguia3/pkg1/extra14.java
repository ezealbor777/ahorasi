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
public class extra14 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de familias: ");
        int nFamilias = leer.nextInt();

        int totalEdadHijos = 0;
        int totalHijos = 0;

        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Introduce la cantidad de hijos de la familia " + i + ": ");
            int nHijos = leer.nextInt();

            for (int j = 1; j <= nHijos; j++) {
                System.out.print("Introduce la edad del hijo " + j + ": ");
                int edadHijo = leer.nextInt();

                totalEdadHijos += edadHijo;
            }

            totalHijos += nHijos;
        }

        double mediaEdadHijos = (double) totalEdadHijos / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdadHijos);
    }
}