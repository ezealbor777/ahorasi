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
public class ej1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;

        System.out.print("Introduce un número entero: ");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es un número par");
        } else {
            System.out.println(num + " es un número impar");
        }
    }
}