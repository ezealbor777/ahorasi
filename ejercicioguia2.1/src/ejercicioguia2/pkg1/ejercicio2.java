/*
 *Escribir un programa que pida tu nombre, lo guarde en una variable 
y lo muestre por pantalla.

 */
package ejercicioguia2.pkg1;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre;
        
        System.out.println("ingrese su otro nombre: " );
        nombre=leer.next();
        System.out.println("soy " + nombre + " y sigo practicando" );
    }
    
}
