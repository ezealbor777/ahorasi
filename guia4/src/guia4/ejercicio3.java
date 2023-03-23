/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Solicitar la cantidad de euros a convertir
        System.out.print("Introduce la cantidad de euros que quieres convertir: ");
        double cantidadEuros = leer.nextDouble();
        leer.nextLine();
        
        // Solicitar la moneda a la que se desea convertir
        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        String moneda = leer.nextLine();
        
        // Convertir la cantidad de euros a la moneda deseada
        switch (moneda) {
            case "libras":
                convertirALibras(cantidadEuros);
                break;
            case "dolares":
                convertirADolares(cantidadEuros);
                break;
            case "yenes":
                convertirAYenes(cantidadEuros);
                break;
            default:
                System.out.println("Moneda no reconocida.");
        }
    }
    
    public static void convertirALibras(double euros) {
        double libras = euros * 0.86;
        System.out.println(euros + " € son " + libras + " libras.");
    }
    
    public static void convertirADolares(double euros) {
        double dolares = euros * 1.28611;
        System.out.println(euros + " € son " + dolares + " dólares.");
    }
    
    public static void convertirAYenes(double euros) {
        double yenes = euros * 129.852;
        System.out.println(euros + " € son " + yenes + " yenes.");
    }
}