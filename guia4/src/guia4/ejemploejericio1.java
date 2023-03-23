/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;


/**
 *
 * @author NET
 */
public class ejemploejericio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase: ");
        String frase = leer.nextLine();
        String letra = codificar(frase);
        System.out.println("La codificación es: " + letra);
    }

    public static String codificar(String frase) {
        String letra = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            switch (c) {
                case 'a':
                    letra = letra.concat("@");
                    break;
                case 'e':
                    letra = letra.concat("#");
                    break;
                case 'i':
                    letra = letra.concat("$");
                    break;
                case 'o':
                    letra = letra.concat("%");
                    break;
                case 'u':
                    letra = letra.concat("*");
                    break;
                case 'A':
                    letra = letra.concat("@");
                    break;
                case 'E':
                    letra = letra.concat("#");
                    break;
                case 'I':
                    letra = letra.concat("$");
                    break;
                case 'O':
                    letra = letra.concat("%");
                    break;
                case 'U':
                    letra = letra.concat("*");
                    break;
                default:
                    letra = letra.concat(String.valueOf(c));
            }
        }
        return letra;
    }
}