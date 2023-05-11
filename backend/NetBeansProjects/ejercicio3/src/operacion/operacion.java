/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class operacion {
  private double numero1;
    private double numero2;
    
    public operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    
    public double getNumero1() {
        return numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double sumar() {
        return numero1 + numero2;
    }
    
    public double restar() {
        return numero1 - numero2;
    }
    
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
    }
    
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        else {
            return numero1 / numero2;
        }
    }
}