/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import operacion.operacion;

/**
 *
 * @author NET
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      operacion op = new operacion();
    op.crearOperacion();
    System.out.println("La suma es: " + op.sumar());
    System.out.println("La resta es: " + op.restar());
    System.out.println("La multiplicación es: " + op.multiplicar());
    System.out.println("La división es: " + op.dividir());
    }
    
}
    