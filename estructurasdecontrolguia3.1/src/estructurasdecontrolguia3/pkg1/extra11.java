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
public class extra11 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, cantidadDigitos = 0;
        
        System.out.print("Ingrese un número entero: ");
        numero = leer.nextInt();
        
        while (numero > 0) {
            cantidadDigitos++;
            numero = numero/10;
        }
        
        System.out.println("El número ingresado tiene " + cantidadDigitos + " dígitos.");
    }
}



