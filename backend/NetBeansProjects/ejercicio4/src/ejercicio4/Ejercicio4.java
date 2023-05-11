/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Rectangulo.Rectangulo;

/**
 *
 * @author NET
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Rectangulo rectangulo1 = new Rectangulo();
    rectangulo1.crearRectangulo();
    System.out.println("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
    System.out.println("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
    rectangulo1.dibujarRectangulo();
    }
}
