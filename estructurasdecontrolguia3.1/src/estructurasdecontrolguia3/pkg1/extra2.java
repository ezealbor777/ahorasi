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
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,aux;
        
        System.out.println("ingrese el valor de A");
        A = leer.nextInt();
        System.out.println("ingrese el valor de B");
        B = leer.nextInt();
        System.out.println("ingrese el valor de C");
        C = leer.nextInt();
        System.out.println("ingre el valor de D");
        D = leer.nextInt();
        
        System.out.println("valores iniciales: ");
        System.out.println("A: " + A + ", B " + B + ", C " + C + ", D " + D);
        
        aux = B;
        B = C; 
        C = A;
        A = D;
        D = aux;
        
        System.out.println("valores finales: ");
        System.out.println("A: " + A + ", B " + B + ", C " + C + ", D " + D);
        
        
        
    }
    
}
