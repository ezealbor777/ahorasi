/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ParDeNumeros.ParDeNumeros;

/**
 *
 * @author NET
 */
public class ParDeNumerosService {
    private ParDeNumeros pardenumeros = new ParDeNumeros();
    //Método mostrarValores
    public void mostrarValores(){
        System.out.println("Los dos numeros son: " + pardenumeros.getNumero1() + " y " + pardenumeros.getNumero2());
    }
    //Método devolverMayor
    public double devolverMayor(){
        return Math.max(pardenumeros.getNumero1(), pardenumeros.getNumero2());
    }
    
    //Método calcularPotencia
    public double calcularPotencia(){
        double mayor = devolverMayor();
        double menor = Math.min(pardenumeros.getNumero1(), pardenumeros.getNumero2());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
     } 
    
    //Método calculaRaiz
    public double calculaRaiz(){
        double menor = Math.min(pardenumeros.getNumero1(), pardenumeros.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
    
 }   
