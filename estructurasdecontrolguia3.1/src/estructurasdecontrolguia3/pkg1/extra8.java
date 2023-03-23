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
public class extra8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorTotal = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        
        while(true) {
            System.out.print("Ingrese un número entero: ");
            int numero = leer.nextInt();
            
            if(numero % 5 == 0) {
                break;
            }
            
            if(numero < 0) {
                continue;
            }
            
            contadorTotal++;
            
            if(numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        System.out.println("Cantidad total de números leídos: " + contadorTotal);
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}