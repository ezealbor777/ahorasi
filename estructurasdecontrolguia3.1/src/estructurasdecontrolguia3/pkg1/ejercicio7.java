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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int tipoMotor;
          System.out.println("Elija la opcion de motor");
        tipoMotor=leer.nextInt();
      
        
        switch (tipoMotor){
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
               System.out.println("La bomba es una bomba de pasta alimenticia");
               break;
            case 5:
                System.out.println("No existe un valor válido para tipo de"
                        + " bomba");
            default:
                System.out.println("El valor ingresado en la variable opcion es"
                        + " diferente" + "a todos los casos analizados"
                        + " por el switch");
        }
    }
    
}
