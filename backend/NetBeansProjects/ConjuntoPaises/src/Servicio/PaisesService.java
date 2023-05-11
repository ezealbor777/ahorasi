/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class PaisesService {

      public HashSet<String> ingresarPaises() {
        Scanner sc = new Scanner(System.in);
        HashSet<String> paisesSet = new HashSet<>();

        boolean seguirIngresando = true;

        while (seguirIngresando) {
            System.out.println("Ingrese un país:");
            String pais = sc.next();

            paisesSet.add(pais);

            System.out.println("¿Desea ingresar otro país? (S/N)");
            String respuesta = sc.next().toUpperCase();

            if (!respuesta.equals("S")) {
                seguirIngresando = false;
            }
        }

        return paisesSet;
    }

    public void mostrarPaisesOrdenados(HashSet<String> paisesSet) {
        ArrayList<String> paisesList = new ArrayList<>(paisesSet);
        Collections.sort(paisesList);

        System.out.println("Países ordenados alfabéticamente:");
        for (String pais : paisesList) {
            System.out.println(pais);
        }
    }

    public void eliminarPais(HashSet<String> paisesSet, String pais) {
        if (paisesSet.contains(pais)) {
            paisesSet.remove(pais);
            System.out.println("País eliminado: " + pais);
            System.out.println("Conjunto actualizado:");
            for (String p : paisesSet) {
                System.out.println(p);
            }
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }
}