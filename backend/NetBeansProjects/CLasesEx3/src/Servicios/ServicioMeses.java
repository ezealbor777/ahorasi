/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Meses.MesesdelAño;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ServicioMeses {
    private MesesdelAño mesesdelaño = new MesesdelAño();
    Scanner sc = new Scanner(System.in);
    
 public ServicioMeses() {
        mesesdelaño = new MesesdelAño();
        sc = new Scanner(System.in);
    }

    public void adivinarMesSecreto() {
        String mesAdivinado;
        do {
            System.out.print("Adivine el mes secreto. Ingrese mes:");
            mesAdivinado = sc.nextLine();
        } while (!mesAdivinado.equals(mesesdelaño.getMesSecreto()));
        System.out.println("¡Ha acertado!");
    }
}