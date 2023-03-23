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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num, suma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Introduce el número " + i + ": ");
            num = leer.nextInt();

            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }

            if (num > 0) {
                suma += num;
            }
        }

        System.out.println("La suma de los números introducidos (sin contar los negativos) es: " + suma);
    }
}
