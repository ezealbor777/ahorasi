/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author NET
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String frase, mayuscula, minuscula;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        mayuscula=toUpperCase(frase);
        minuscula=toLowerCase(frase);
        System.out.println(mayuscula);
        System.out.println(minuscula);
    }
    
}
