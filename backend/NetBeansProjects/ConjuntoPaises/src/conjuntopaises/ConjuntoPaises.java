/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntopaises;

import Servicio.PaisesService;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ConjuntoPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PaisesService paisesService = new PaisesService();
    HashSet<String> paisesSet = paisesService.ingresarPaises();
    paisesService.mostrarPaisesOrdenados(paisesSet);

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un país a eliminar:");
    String pais = sc.next();
    paisesService.eliminarPais(paisesSet, pais);
    }
}
