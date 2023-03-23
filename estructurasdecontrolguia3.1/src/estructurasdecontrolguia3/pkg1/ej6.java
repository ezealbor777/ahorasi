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
public class ej6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmacion;

        System.out.print("Introduce el primer número: ");
        num1 = leer.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = leer.nextInt();

        do {
            System.out.println("\nMENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");

            System.out.print("\nElija una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nLa suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("\nLa resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("\nLa multiplicación de los números es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("\nNo se puede dividir por cero.");
                    } else {
                        System.out.println("\nLa división de los números es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("\n¿Está seguro que desea salir del programa (S/N)? ");
                    confirmacion = leer.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("\n¡Hasta luego!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("\nOpción incorrecta. Intente nuevamente.");
            }

        } while (opcion != 5);
    }
}