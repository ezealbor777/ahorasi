/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
    
        int numero1,numero2;
        
        System.out.println("ingrese dos numeros enteros: " );
        numero1=leer.nextInt();
        numero2=leer.nextInt();
                
       int suma=numero1+numero2;
        System.out.println("La suma de los numeros ingresados es: " );
        System.out.println(suma);
    }
}
