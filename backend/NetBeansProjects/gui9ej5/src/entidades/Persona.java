/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author NET
 */
public class Persona {
    private String nombre;
    private LocalDate FechaNacimiento;
    
      public Persona(String nombre, LocalDate FechaNacimiento) {
        this.nombre = nombre;
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

  
   
}
