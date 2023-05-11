/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ex2;

import Ahorcado.Ahorcado;
import AhorcadoService.AhorcadoService;


/**
 *
 * @author NET
 */
public class Guia9ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoService Juego = new AhorcadoService();
        Ahorcado juego = Juego.crearJuego();
        Juego.juego(juego);
    }
    
}
