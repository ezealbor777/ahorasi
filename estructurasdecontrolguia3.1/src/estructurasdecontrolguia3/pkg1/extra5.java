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
public class extra5 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la clase de socio (A, B o C): ");
        char clase = leer.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = leer.nextDouble();
        double descuento = 0;
        switch (clase) {
            case 'A':
                descuento = costo * 0.5;
                break;
            case 'B':
                descuento = costo * 0.35;
                break;
            case 'C':
                descuento = 0;
                break;
            default:
                System.out.println("La clase de socio ingresada es inválida.");
                return;
        }
        double importe = costo - descuento;
        System.out.println("El importe en efectivo a pagar es $" + importe);
    }
}