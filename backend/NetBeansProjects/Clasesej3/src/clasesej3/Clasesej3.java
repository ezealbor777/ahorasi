/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesej3;

import entidades.Persona;
import servicio.PersonaServicios;

/**
 *
 * @author NET
 */
public class Clasesej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaServicios servicio = new PersonaServicios();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        System.out.println("Ingrese los datos para la primera persona:");
        servicio.crearPersona(persona1);

        System.out.println("Ingrese los datos para la segunda persona:");
        servicio.crearPersona(persona2);

        System.out.println("Ingrese los datos para la tercera persona:");
        servicio.crearPersona(persona3);

        System.out.println("Ingrese los datos para la cuarta persona:");
        servicio.crearPersona(persona4);

        System.out.println("Resultados:");
        System.out.println("Persona 1 - IMC: " + servicio.calcularIMC(persona1) + ", Mayor de edad: " + servicio.esMayorDeEdad(persona1));
        System.out.println("Persona 2 - IMC: " + servicio.calcularIMC(persona2) + ", Mayor de edad: " + servicio.esMayorDeEdad(persona2));
        System.out.println("Persona 3 - IMC: " + servicio.calcularIMC(persona3) + ", Mayor de edad: " + servicio.esMayorDeEdad(persona3));
        System.out.println("Persona 4 - IMC: " + servicio.calcularIMC(persona4) + ", Mayor de edad: " + servicio.esMayorDeEdad(persona4));
    }
}