/*
 Escribir un programa que lea un número entero por teclado y muestre 
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package ejercicio2.pkg4;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero,numero2,numero3,raiz;
        System.out.println("ingrese un numero entero");
        numero=leer.nextInt();
            numero2 = numero*2;
            numero3 = numero*3;
            raiz=(int) Math.sqrt(numero);
            System.out.println("el doble del numero es: " + numero2);
            System.out.println("el triple del numero es: " + numero3);
            System.out.println("la raiz cuadrada es: " + raiz);
    }
    
}
