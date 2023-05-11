/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raza;
import java.util.ArrayList;

import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class RazzaService {

    public ArrayList<Raza> crearRaza() {
        ArrayList<Raza> perroLista = new ArrayList();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = true;
        while (bandera) {

            System.out.println("Ingrese el nombre de su perro: ");
            String nombre = sc.next();
            System.out.println("Ingrese la raza de su perro: ");
            String raza = sc.next();

            Raza r = new Raza(raza, nombre);
            perroLista.add(r);
            System.out.println("quiere seguir ingresando: S/N");
            String respuesta = sc.next();
            while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                System.out.println("respuesta incorrecta");
                System.out.println("elija (S/N)");
                
                respuesta = sc.next();
            }
            if (respuesta.equalsIgnoreCase("N")){
                bandera = false;
            }
        }

        return perroLista;
    }

   
    public void mostrarRaza(ArrayList <Raza> raza) {
        
        System.out.println("Los perros actuales de la lista son: ");
        for (Raza aux : raza) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + raza.size());

    }

    public void eliminarRaza(ArrayList<Raza> perro) {
        System.out.println("ingrese el nombre del perro a eliminar: ");
        Scanner sc = new Scanner(System.in);
        String nombrePerro = sc.next();
        boolean encontrado = false;
        Iterator<Raza> iter = perro.iterator();
        while (iter.hasNext()) {
            Raza raza = (Raza) iter.next();
            if (raza.getNombre().equalsIgnoreCase(nombrePerro)) {
                iter.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El perro " + nombrePerro + " ha sido eliminado.");
        } else {
            System.out.println("El perro " + nombrePerro + " no se encuentra en la lista.");
        }
    }
}
