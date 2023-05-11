/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej3;

import ArregloServicio.ArregloServicio;

/**
 *
 * @author NET
 */
public class Guia9ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double[] arregloA = new double[50];
      double[] arregloB = new double[20];
      
       ArregloServicio arregloService = new ArregloServicio();

        arregloService.inicializarA(arregloA);
        System.out.println("Arreglo A inicializado: ");
        arregloService.mostrar(arregloA);

        arregloService.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor: ");
        arregloService.mostrar(arregloA);

        arregloService.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B inicializado: ");
        arregloService.mostrar(arregloB);

        System.out.println("Arreglo A después de inicializar B: ");
        arregloService.mostrar(arregloA);
    }
}
