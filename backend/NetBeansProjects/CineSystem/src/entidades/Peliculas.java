/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalTime;

/**
 *
 * @author NET
 */
public class Peliculas {
    
    private String titulo;
    private String director;
    private LocalTime hora;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, LocalTime hora) {
        this.titulo = titulo;
        this.director = director;
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", hora=" + hora + '}';
    }
    
}
