/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraServicio;

import Entidades.Cafetera;
import java.util.Scanner;



/**
 *
 * @author NET
 */
public class CafeteraServicio {
    
  private Cafetera cafetera;

    public CafeteraServicio(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera ha sido llenada.");
    }

    public void servirTaza(int tamanoTaza) {
        if (tamanoTaza > 250) {
            System.out.println("Lo siento, el tamaño máximo de la taza es de 250ml. Inténtalo de nuevo.");
            return;
        }

        int cantidadServida = Math.min(tamanoTaza, cafetera.getCantidadActual());
        cafetera.setCantidadActual(cafetera.getCantidadActual() - cantidadServida);

        if (cantidadServida == tamanoTaza) {
            System.out.println("Se ha llenado la taza.");
        } else {
            System.out.println("No se ha podido llenar la taza completamente. La cantidad servida es: " + cantidadServida + "ml.");
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de café a añadir: ");
        int cantidadCafe = sc.nextInt();
        int capacidadDisponible = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        int cantidadAgregada = Math.min(cantidadCafe, capacidadDisponible);
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadAgregada);
        System.out.println("Se ha añadido " + cantidadAgregada + "ml de café a la cafetera.");
    }

}