/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

/**
 *
 * @author NET
 */
public class cadena {
      private String frase;
    private int longitud;

    public cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    public cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }
}