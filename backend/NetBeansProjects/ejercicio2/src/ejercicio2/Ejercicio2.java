/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import circunferencia.circunferencia;

/**
 *
 * @author NET
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Circunferencia
    circunferencia circ = new circunferencia(5.0);

    // Imprimir el radio del objeto
    System.out.println("Radio: " + circ.getRadio());

    // Modificar el radio del objeto
    circ.setRadio(10.0);

    // Imprimir el radio modificado
    System.out.println("Radio modificado: " + circ.getRadio());

    // Calcular el área de la circunferencia
    double area = circ.area();
    System.out.println("Área: " + area);

    // Calcular el perímetro de la circunferencia
    double perimetro = circ.perimetro();
    System.out.println("Perímetro: " + perimetro);
    }
}