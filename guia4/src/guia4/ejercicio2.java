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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean seguirMostrandoPersonas = true;
        while (seguirMostrandoPersonas) {
            // Pedir los datos de la persona
            Persona persona = pedirDatosPersona(scanner);

            // Determinar si la persona es mayor o menor de edad
            String mensajeEdad = determinarEdad(persona);

            // Imprimir los datos de la persona y su edad
            System.out.println("Nombre: " + persona.nombre);
            System.out.println("Edad: " + persona.edad);
            System.out.println(mensajeEdad);

            // Preguntar si se desea seguir mostrando personas
            System.out.print("¿Desea seguir mostrando personas? (Si/No): ");
            String respuesta = scanner.nextLine();
            seguirMostrandoPersonas = respuesta.equalsIgnoreCase("Si");
        }
    }

    public static Persona pedirDatosPersona(Scanner scanner) {
        // Pedir el nombre de la persona
        System.out.print("Introduce el nombre de la persona: ");
        String nombre = scanner.nextLine();

        // Pedir la edad de la persona
        System.out.print("Introduce la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de la edad

        return new Persona(nombre, edad);
    }

    public static String determinarEdad(Persona persona) {
        if (persona.edad >= 18) {
            return "Es mayor de edad.";
        } else {
            return "Es menor de edad.";
        }
    }

    public static class Persona {
        public String nombre;
        public int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
}





