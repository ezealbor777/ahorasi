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
public class ej7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String input = "";
        int correctCount = 0;
        int incorrectCount = 0;
        
        while (true) {
            System.out.print("Ingrese una cadena (FDE para salir): ");
            input = leer.nextLine();
            
            if (input.equals("&&&&&")) {
                break;
            }
            
            if (input.length() != 5 || input.charAt(0) != 'X' || input.charAt(4) != 'O') {
                System.out.println("Error: Cadena incorrecta");
                incorrectCount++;
            } else {
                System.out.println("Cadena correcta");
                correctCount++;
            }
        }
        
        System.out.println("Informe final:");
        System.out.println("Cadenas correctas: " + correctCount);
        System.out.println("Cadenas incorrectas: " + incorrectCount);
    }
}
