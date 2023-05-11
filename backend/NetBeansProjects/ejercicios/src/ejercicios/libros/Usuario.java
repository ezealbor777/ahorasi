/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.libros;


/**
 *
 * @author NET
 */
public class Usuario {

   
    private String nombre;
    private String apellido;
    private String pais;

    public Usuario() {}

    public Usuario(String nombre, String apellido, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
