/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaServicio;

import Cadena.cadena;


/**
 *
 * @author NET
 */
public class cadenaservicio {
   public static void mostrarVocales(cadena cadena) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.indexOf(cadena.getFrase().charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("La frase " + cadena.getFrase() + " tiene " + count + " vocales.");
    }

    public static void invertirFrase(cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        String reversed = sb.reverse().toString();
        System.out.println("La frase invertida es: " + reversed);
    }

    public static void vecesRepetido(cadena cadena, char letra) {
        int count = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                count++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + count + " veces en la frase " + cadena.getFrase());
    }

    public static void compararLongitud(cadena cadena, String otraFrase) {
        int longitudOtraFrase = otraFrase.length();
        if (cadena.getLongitud() > longitudOtraFrase) {
            System.out.println("La frase " + cadena.getFrase() + " es más larga que " + otraFrase);
        } else if (cadena.getLongitud() < longitudOtraFrase) {
            System.out.println("La frase " + cadena.getFrase() + " es más corta que " + otraFrase);
        } else {
            System.out.println("La frase " + cadena.getFrase() + " tiene la misma longitud que " + otraFrase);
        }
    }

    public static void unirFrases(cadena cadena, String otraFrase) {
        String resultado = cadena.getFrase() + " " + otraFrase;
        System.out.println("La frase resultante de unir " + cadena.getFrase() + " con " + otraFrase + " es: " + resultado);
    }

    public static void reemplazar(cadena cadena, char letra, char nuevaLetra) {
        String resultado = cadena.getFrase().replace(letra, nuevaLetra);
        System.out.println("La frase resultante de reemplazar todas las letras '" + letra + "' por '" + nuevaLetra + "' es: " + resultado);
    }

    public static boolean contiene(cadena cadena, char letra) {
        return cadena.getFrase().indexOf(letra) != -1;
    }
}