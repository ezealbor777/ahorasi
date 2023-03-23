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
public class extra92 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo, divisor, cociente = 0, residuo = 0;
        
        System.out.print("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        divisor = leer.nextInt();
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        residuo = dividendo;
        
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
}