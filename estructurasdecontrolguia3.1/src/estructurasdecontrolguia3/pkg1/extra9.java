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
public class extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int dividendo,divisor,coeciente=0;
        
        System.out.println("Ingrese el dividiendo mayor a 1");
        dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor mayor a 1");
        divisor = leer.nextInt();
        
        while (dividendo <= 1) {
            System.out.println("Ingrese otro numnero mayor a 1 ");
            dividendo = leer.nextInt();
        }
        while (divisor <= 1) {
            System.out.println("Ingrese otro numnero mayor a 1 ");
            divisor = leer.nextInt();
        }
        while (dividendo > divisor) {
            System.out.println("dividendo: "+dividendo+ " divisor: "+divisor );
            System.out.println(dividendo+"-"+divisor+"="+(dividendo-divisor));
            dividendo = dividendo-divisor;
            coeciente ++;
        }
        System.out.println("el cociente es: " + coeciente);
        System.out.println("el residuo es: " + dividendo);
            
           
        }
    } 

