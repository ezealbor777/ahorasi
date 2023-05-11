/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import NIF.NIF;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class NIFService {
    private NIF nif = new NIF();

   
    public void crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI: ");
        long numeroDni = sc.nextLong();
        this.nif.setNumeroDni(numeroDni);
        this.nif.calcularLetra();
        sc.close();
    }

    public void mostrarNif() {
        this.nif.mostrar();
    }

    
}