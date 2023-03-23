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
public class extra10 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11); 
        int respuesta;
        
        System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
        respuesta = sc.nextInt();
        
        while (respuesta != num1 * num2) {
            System.out.println("Respuesta incorrecta. Intente nuevamente.");
            System.out.print("¿Cuánto es " + num1 + " x " + num2 + "? ");
            respuesta = sc.nextInt();
        }
        
        System.out.println("¡Respuesta correcta! " + num1 + " x " + num2 + " = " + respuesta);
    }
}