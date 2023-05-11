/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class PersonaService {
    
    //metodo crearPersona
    public void crearPersona(Persona persona){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
        String fecha = sc.next();
        DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechadeNacimiento = LocalDate.parse(fecha, formatofecha);
        persona.setFechaNacimiento(fechadeNacimiento);
        System.out.println("persona creada: ");
    }
    // metodo calcularEdad
    public int calcularEdad(Persona persona){
        LocalDate fechaActual = LocalDate.now();
        int Edad = Period.between(persona.getFechaNacimiento(), fechaActual).getYears();
        return Edad;
    }
    // metodo menorQue
    public boolean menorQue(Persona persona, int edad){
        int resultado = calcularEdad(persona);
        return resultado < edad;
    }
    //metodo mostrarPersona
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre() + "\n fecha de nacimiento " + persona.getFechaNacimiento());
        
    }
    
}
        
    
    

    


