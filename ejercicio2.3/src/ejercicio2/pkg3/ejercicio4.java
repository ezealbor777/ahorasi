/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg3;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
       double c,f;
        System.out.println("imgrese la temperatura en C");
                c=leer.nextDouble();
                f=32+(9*c/5);
                
      System.out.println("la conversion de centigrados a farenheint es: " + f);

    }
    
}
