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
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, numero, suma = 0;

        System.out.print("Introduce un valor límite positivo: ");
        limite = leer.nextInt();

        while (suma <= limite) {
            System.out.print("Introduce un número: ");
            numero =leer.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números introducidos supera el límite inicial.");
    }
}