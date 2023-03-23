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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero1,numero2;
        
        System.out.println("Ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=leer.nextInt();
        
        if (numero1 > 25) {
            System.out.println("El mayor es " + numero1);
        } else if (numero1 <25) {
            System.out.println("El mayor es " + 25);
        }
if (numero2 > 25) {      
    System.out.println("El mayor es " + numero2);
}
    else if (numero2<25){
        System.out.println("El mayor es " + 25);
            
            }

} 
    }

