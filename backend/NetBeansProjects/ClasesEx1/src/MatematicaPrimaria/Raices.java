/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatematicaPrimaria;

/**
 *
 * @author NET
 */
public class Raices {
    private double a;
    private double b;
    private double c;
    
    public Raices(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    
    public Raices(){
        
    }
    
    public double getA (){
        return a;
    }    
    
    public void setA(int a){
        this.a = a;
    }
    
     public double getB (){
        return b;
    }    
    
    public void setB(int b){
        this.b = b;
    }
     public double getC (){
        return c;
    }    
    
    public void setC(int c){
        this.c = c;
    }
}
