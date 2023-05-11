/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesex1;

import MatematicaPrimaria.Raices;
import Servicios.RaicesServicios;

/**
 *
 * @author NET
 */
public class ClasesEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Raices raices = new Raices(2, 7, 8);
        RaicesServicios servicios = new RaicesServicios(raices);
        
        servicios.calcular(); 
        servicios.obtenerRaiz();
    }
    
}
