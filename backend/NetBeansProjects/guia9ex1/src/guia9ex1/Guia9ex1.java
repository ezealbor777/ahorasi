/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ex1;

import MesesService.MesesService;
import entidad.Meses;

/**
 *
 * @author NET
 */
public class Guia9ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesesService servicio = new MesesService();
    Meses meses = new Meses();
    
    servicio.cargarmesSecreto(meses);
    servicio.adivinarMes(meses);
    }
    
}
