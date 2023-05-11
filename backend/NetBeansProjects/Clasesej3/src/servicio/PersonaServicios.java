/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class PersonaServicios {
  Scanner sc = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public void crearPersona(Persona persona) {
       System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        persona.setNombre(nombre);
        
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        persona.setEdad(edad);

        System.out.print("Ingrese el sexo (H para hombre, M para mujer, O para otro): ");
        char sexo = sc.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
        System.out.print("Sexo inválido, ingrese nuevamente (H para hombre, M para mujer, O para otro): ");
        sexo = sc.nextLine().charAt(0);
    }
        persona.setSexo(sexo);

        System.out.print("Ingrese el peso (en kg): ");
        double peso = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea
        persona.setPeso(peso);

        System.out.print("Ingrese la altura (en m): ");
        double altura = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea
        persona.setAltura(altura);
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}