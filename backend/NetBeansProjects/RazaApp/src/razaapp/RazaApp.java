/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razaapp;

import Entidades.Raza;
import Servicio.RazzaService;
import java.util.ArrayList;


/**
 *
 * @author NET
 */
public class RazaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Raza> perro;
        RazzaService RS = new RazzaService();
        perro = RS.crearRaza();
        RS.mostrarRaza(perro);
        RS.eliminarRaza(perro);
        RS.mostrarRaza(perro);
    }
}
