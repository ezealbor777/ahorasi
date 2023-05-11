/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

/**
 *
 * @author NET
 */
public class Ahorcado {
  private String[] palabraAdivinar;
    private int letrasEncontradas;
    private int jugadasMaximas;
    
    public Ahorcado(){
        
    }
    
    public Ahorcado(String[] palabraAdivinar, int jugadasMaximas) {
        this.palabraAdivinar = palabraAdivinar;
        this.letrasEncontradas = 0;
        this.jugadasMaximas = jugadasMaximas;
    }

    // getters y setters para cada atributo

    public String[] getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String[] palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
}