/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Rectangulo {

    private double base;
    private double altura;
    
    // Constructor por defecto
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Métodos getters y setters
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para crear el rectángulo
    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = sc.nextDouble();
        this.base = base;
        this.altura = altura;
    }
    
    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
    
    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}