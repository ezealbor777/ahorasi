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
public class Mascota {
     private String nombre;
    private String apodo;
    private String raza;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String raza, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 @Override
    public String toString() {
        return "Mascota { nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", edad=" + edad + " }";
    }
}
    
