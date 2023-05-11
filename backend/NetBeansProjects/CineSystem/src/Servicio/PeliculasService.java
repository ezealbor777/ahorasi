/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Peliculas;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class PeliculasService {

    public ArrayList<Peliculas> crearPelicula() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = true;
        ArrayList<Peliculas> peliculas = new ArrayList<>();

        while (bandera) {
            System.out.println("Ingrese el nombre de la película:");
            String nombrePelicula = sc.next();
            System.out.println("Ingrese el nombre del director:");
            String nombreDirector = sc.next();
            System.out.println("Ingrese la duración de la película (en formato HH:mm:ss):");
            String duracion = sc.next();

            // convertir la duración ingresada en un objeto LocalTime
            LocalTime hora = LocalTime.parse(duracion);

            // crear un nuevo objeto Peliculas con los datos ingresados
            Peliculas pelicula = new Peliculas(nombrePelicula, nombreDirector, hora);

            // agregar el objeto Peliculas a la lista
            peliculas.add(pelicula);
            
            
            System.out.println("¿Desea ingresar otra película? (S/N)");
            String respuesta = sc.next().toUpperCase();
            if (!respuesta.equals("S")) {
                bandera = false;
            }
        }
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Peliculas> peliculas) {
        System.out.println("Lista de todas las películas: ");
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Lista de películas con duración mayor a 1 hora: ");
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getHora().toSecondOfDay() > 3600) {
                System.out.println(pelicula);
            }
        }
    }

   public void ordenarPeliculas(ArrayList<Peliculas> peliculas) {
        System.out.println("Películas ordenadas por:");
        System.out.println("1. Duración (de mayor a menor):");
        Collections.sort(peliculas, (p1, p2) -> p2.getHora().compareTo(p1.getHora()));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("2. Duración (de menor a mayor):");
        Collections.sort(peliculas, Comparator.comparing(Peliculas::getHora));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("3. Título (alfabéticamente):");
        Collections.sort(peliculas, Comparator.comparing(Peliculas::getTitulo));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("4. Director (alfabéticamente):");
        Collections.sort(peliculas, Comparator.comparing(Peliculas::getDirector));
        for (Peliculas pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }
}