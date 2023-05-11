/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Juego {
    private int numeroAdivinar;
    private int intentosMaximos;
    private int intentos;
    private int ganador;
    private int contadorJugador1;
    private int contadorJugador2;

    public void iniciar_juego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.print("Jugador 1, elige un número: ");
        numeroAdivinar = sc.nextInt();
        System.out.print("Jugador 2, ¿cuántos intentos quieres tener? ");
        intentosMaximos = sc.nextInt();
        intentos = intentosMaximos;
        ganador = 0;
        contadorJugador1 = 0;
        contadorJugador2 = 0;
        
        while (intentos > 0 && ganador == 0) {
            System.out.print("Jugador 2, adivina el número: ");
            int numeroAdivinado = sc.nextInt();
            intentos--;
            
            if (numeroAdivinado == numeroAdivinar) {
                System.out.println("¡Correcto! El número era " + numeroAdivinar);
                ganador = 2;
            } else if (numeroAdivinado < numeroAdivinar) {
                System.out.println("El número es más alto");
            } else {
                System.out.println("El número es más bajo");
            }
        }
        
        if (ganador == 2) {
            System.out.println("¡Felicidades, Jugador 2, ganaste en " + (intentosMaximos - intentos) + " intentos!");
            contadorJugador2++;
        } else {
            System.out.println("Lo siento, no has adivinado el número. El número era " + numeroAdivinar);
            contadorJugador1++;
        }
        
        System.out.println("Jugador 1 ha ganado " + contadorJugador1 + " veces.");
        System.out.println("Jugador 2 ha ganado " + contadorJugador2 + " veces.");
  // preguntar a los jugadores si quieren jugar otra vez
        System.out.print("¿Quieres jugar de nuevo? (S/N): ");
        String respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("S")) {
            iniciar_juego(); // volver a jugar
        } else {
            System.out.println("¡Gracias por jugar!");
        }
    }
}

   



