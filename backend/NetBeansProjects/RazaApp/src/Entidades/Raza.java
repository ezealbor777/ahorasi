/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author NET
 */
public class Raza {
    private String raza;
    private String nombre;

    public Raza() {
    }

    public Raza(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
        
     @Override
    public String toString() {
        return "Mascota { nombre=" + nombre + ", raza=" + raza + " }";
    }
    
}
