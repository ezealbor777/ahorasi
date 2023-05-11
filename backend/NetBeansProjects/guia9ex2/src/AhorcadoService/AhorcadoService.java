/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhorcadoService;

import Ahorcado.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class AhorcadoService {
    
    //metodo crearJuego
    
      public Ahorcado crearJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra a adivinar: ");
        String palabra = sc.nextLine();
        int longitud = palabra.length();
        System.out.print("Ingrese la cantidad máxima de jugadas: ");
        int maxJugadas = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada
        
        String[] letras = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            letras[i] = String.valueOf(palabra.charAt(i));
        }
        return new Ahorcado(letras, maxJugadas);
    }
    
      //Método longitud():
      
    public void longitud(Ahorcado juego) {
        System.out.println("La longitud de la palabra a adivinar es: " + juego.getPalabraAdivinar().length);
    }
    
    //Método buscar(letra):
    
    public boolean buscar(Ahorcado juego, String letra) {
        boolean encontrada = false;
        for (int i = 0; i < juego.getPalabraAdivinar().length; i++) {
            if (juego.getPalabraAdivinar()[i].equals(letra)) {
                encontrada = true;
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + 1);
            }
        }
        if (encontrada) {
            System.out.println("La letra " + letra + " se encuentra en la palabra.");
        } else {
            System.out.println("La letra " + letra + " no se encuentra en la palabra.");
            juego.setJugadasMaximas(juego.getJugadasMaximas() - 1);
        }
        return encontrada;
    }
    
    // Método encontradas(letra):  
    
      public void encontradas(Ahorcado juego, String letra) {
        int encontradas = juego.getLetrasEncontradas();
        int faltan = juego.getPalabraAdivinar().length - encontradas;
        System.out.println("Letras encontradas: " + encontradas);
        System.out.println("Letras faltantes: " + faltan);
    }
     
    //Método intentos(): 
      
     public void intentos(Ahorcado juego) {
        System.out.println("Te quedan " + juego.getJugadasMaximas() + " intentos.");
    } 
      
    //Método juego():
     
     public void juego(Ahorcado juego){
         Scanner sc = new Scanner(System.in);
         while (juego.getJugadasMaximas() > 0 && juego.getLetrasEncontradas() < juego.getPalabraAdivinar().length){
             System.out.println("------------------------------------");
             System.out.println("Adivina la letra: ");
             String letra = sc.nextLine();
             buscar(juego, letra);
             encontradas (juego, letra);
             intentos(juego);
         }
         if (juego.getLetrasEncontradas() == juego.getPalabraAdivinar().length){
             System.out.println("Felicitaciones ganaste");
         }
         else{
             System.out.println("GAME OVER. La palabra era: " + String.join("", juego.getPalabraAdivinar()));
         }
     }
      
}   