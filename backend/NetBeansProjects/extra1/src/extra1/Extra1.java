/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import Cancion.Cancion;

/**
 *
 * @author NET
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Crear un objeto Cancion con título y autor vacíos
    Cancion cancion1 = new Cancion();
    
    // Mostrar los valores iniciales de los atributos
    System.out.println("Título: " + cancion1.getTitulo());
    System.out.println("Autor: " + cancion1.getAutor());
    
    // Modificar los valores de los atributos
    cancion1.setTitulo("Going Under");
    cancion1.setAutor("Evanescence");
    
    // Mostrar los nuevos valores de los atributos
    System.out.println("Título: " + cancion1.getTitulo());
    System.out.println("Autor: " + cancion1.getAutor());
    
    // Crear un objeto Cancion con título y autor especificados
    Cancion cancion2 = new Cancion("Boom", "P.O.D");
    
    // Mostrar los valores de los atributos del objeto cancion2
    System.out.println("Título: " + cancion2.getTitulo());
    System.out.println("Autor: " + cancion2.getAutor());
}
}