/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recetas;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Recetas {
    
    private String Nombre;
    private String []ingredientes;
    private String nombre;
    
    
    public Recetas() { /** constructor vacio*/
    }

    public Recetas(String Nombre, String[] ingredientes) {
        this.Nombre = Nombre;
        this.ingredientes = ingredientes;
    }
    
    /** metodo cargar nombr
     * @return e*/
    
    public String cargar(){
        
    Scanner leer = new Scanner(System.in);
    this.nombre =leer.nextLine();
    return this.nombre;
    }
}
    public String []cargarReceta(){
        System.out.println("ingrese caqntidad de ingredientes");
     Scanner leer = new Scanner(System.in);
     String cantidad = leer.next();
     
     return null;
}