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
public class extra4 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int num = leer.nextInt();
        String roman = "";
        switch (num) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                System.out.println("El número ingresado no está en el rango válido.");
        }
        System.out.println("El número " + num + " en números romanos es " + roman);
    }
}