/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import MatematicaPrimaria.Raices;

/**
 *
 * @author NET
 */
public class RaicesServicios {
 private Raices raices;
 
    public RaicesServicios(Raices raices){
        this.raices = raices;
    }
    //Método getDiscriminante()
    
    public double getDiscriminante(){
        return (Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC()));
    }
    
    //Método tieneRaices()
    
    public boolean tieneRaices(){
        return getDiscriminante() >=0;
    }
    
    //Método tieneRaiz()
    
    public boolean tieneRaiz(){
        return getDiscriminante() ==0;
    }
    
    //Método obtenerRaices()
    
    public void obtenerRaices(){
        if (tieneRaices()){
            double x1 = (-raices.getB() + Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(getDiscriminante())) / (2 * raices.getA());
            System.out.println("Las posibles soluciones son: x1=  " + x1 + ", x2= " + x2);
        } else{
            System.out.println("No hay una unica solución");
        }
    }
    
    //Método obtenerRaiz()
    
    public void obtenerRaiz(){
        if  (tieneRaiz()){
            double x = -raices.getB() /(2 * raices.getA()); 
            System.out.println("La unica solucion es: x= " +x);
        }else {
            System.out.println("No hay una +única solución");
        }
    }
    
    //Método calcular()
    
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if (tieneRaiz()){ 
            obtenerRaiz();
        }else {
            System.out.println("No hay soluciones reales.");
        }
    }
}
