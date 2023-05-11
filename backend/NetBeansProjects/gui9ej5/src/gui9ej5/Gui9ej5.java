/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui9ej5;

import entidades.Persona;
import servicios.PersonaService;

/**
 *
 * @author NET
 */
public class Gui9ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        PersonaService personaservice = new PersonaService();
        personaservice.crearPersona(persona);
        System.out.println(        personaservice.calcularEdad(persona));
        personaservice.menorQue(persona, 15);
        System.out.println(        personaservice.menorQue(persona, 15));
        personaservice.mostrarPersona(persona);
        
    }
    
    
}
