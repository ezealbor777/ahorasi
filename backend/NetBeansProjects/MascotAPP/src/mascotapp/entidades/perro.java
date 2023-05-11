/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author NET
 */
public class perro {
    private String nombre;
    private String apodo;
    private String raza;
 

    public perro() {
    }

    public perro(String nombre, String apodo, String raza, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
      
    }

    public String getNombra() {
        return nombre;
    }

    public void setNombra(String nombra) {
        this.nombre = nombra;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

 
    
}
