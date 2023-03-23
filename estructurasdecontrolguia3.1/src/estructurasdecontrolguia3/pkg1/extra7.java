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
public class extra7 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = leer.nextInt();
        
        int contador = 0;
        double suma = 0.0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        
        while(contador < n) {
            System.out.print("Ingrese un número: ");
            double numero = leer.nextDouble();
            contador++;
            suma += numero;
            
            if(numero > maximo) {
                maximo = numero;
            }
            
            if(numero < minimo) {
                minimo = numero;
            }
        }
        
        double promedio = suma / n;
        
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
    }
}