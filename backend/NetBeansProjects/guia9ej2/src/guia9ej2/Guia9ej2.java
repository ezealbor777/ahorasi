/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej2;

import Servicios.ParDeNumerosService;



/**
 *
 * @author NET
 */
public class Guia9ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ParDeNumerosService pardenumerosservice =  new ParDeNumerosService();
      pardenumerosservice.mostrarValores();
        System.out.println("EL mayor numero es: " + pardenumerosservice.devolverMayor());
        System.out.println("La potencia del mayor número elevado al menor número es: " + pardenumerosservice.calcularPotencia());
        System.out.println("La raíz cuadrada del menor número es: " + pardenumerosservice.calculaRaiz());
             
    }
    
}
