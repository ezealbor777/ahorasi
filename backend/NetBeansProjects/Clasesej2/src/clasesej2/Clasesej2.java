/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesej2;

import CafeteraServicio.CafeteraServicio;
import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Clasesej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cafetera cafetera = new Cafetera(1500, 500);
        CafeteraServicio cafeteraServicio = new CafeteraServicio(cafetera);
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Elige una opción:");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir una taza");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cafeteraServicio.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Introduce el tamaño de la taza en ml: ");
                    int tamanoTaza = scanner.nextInt();
                    cafeteraServicio.servirTaza(tamanoTaza);
                    break;
                case 3:
                    cafeteraServicio.vaciarCafetera();
                    break;
                case 4:
                    cafeteraServicio.agregarCafe();
                    break;
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println("La cantidad actual de café en la cafetera es: " + cafetera.getCantidadActual() + "ml.");
        }
    }
}