/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej4;

import java.util.Date;
import servicio.FechaService;

/**
 *
 * @author NET
 */
public class Guia9ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Date fechaNacimiento = FechaService.fechaNacimiento();
        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);

        Date fechaActual = FechaService.fechaActual();
        System.out.println("La fecha actual es: " + fechaActual);

        int edad = FechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Tienes " + edad + " años.");
    }
}