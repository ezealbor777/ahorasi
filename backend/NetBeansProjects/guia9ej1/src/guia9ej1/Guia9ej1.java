/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej1;

import Cadena.cadena;
import CadenaServicio.cadenaservicio;

/**
 *
 * @author NET
 */
public class Guia9ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos una instancia de la clase Cadena
        cadena miCadena = new cadena("Hola mundo");

        // Llamamos al método mostrarVocales de la clase CadenaServicio
        cadenaservicio.mostrarVocales(miCadena);

        // Llamamos al método invertirFrase de la clase CadenaServicio
        cadenaservicio.invertirFrase(miCadena);

        // Llamamos al método vecesRepetido de la clase CadenaServicio
        cadenaservicio.vecesRepetido(miCadena, 'o');

        // Llamamos al método compararLongitud de la clase CadenaServicio
        cadenaservicio.compararLongitud(miCadena, "Hola");

        // Llamamos al método unirFrases de la clase CadenaServicio
        cadenaservicio.unirFrases(miCadena, "Buenos días");

        // Llamamos al método reemplazar de la clase CadenaServicio
        cadenaservicio.reemplazar(miCadena, 'o', 'a');

        // Llamamos al método contiene de la clase CadenaServicio y mostramos el resultado
        boolean contieneA = cadenaservicio.contiene(miCadena, 'a');
        System.out.println("La frase " + (contieneA ? "sí" : "no") + " contiene la letra 'a'");
    }
}