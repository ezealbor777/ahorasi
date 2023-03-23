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
public class extra1 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un tiempo en minutos: ");
        int minutos = leer.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        int horasRestantes = horas % 24;

        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horasRestantes + " hora(s)");
    }
}

