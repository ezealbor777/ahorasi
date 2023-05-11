/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinesystem;

import Servicio.PeliculasService;
import entidades.Peliculas;
import java.util.ArrayList;

/**
 *
 * @author NET
 */
public class CineSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      PeliculasService peliculasService = new PeliculasService();
    ArrayList<Peliculas> peliculas = peliculasService.crearPelicula();
    peliculasService.mostrarPeliculas(peliculas);
    peliculasService.ordenarPeliculas(peliculas);
    }
}
