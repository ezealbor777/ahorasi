/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Puntos {
      private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Método constructor vacío
    public Puntos() {
    }

    // Método constructor con todos los atributos pasados por parámetro
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Métodos get y set
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    // Método para crear puntos, pedir al usuario las coordenadas y guardarlas en los atributos
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x1: ");
        this.x1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y1: ");
        this.y1 = sc.nextDouble();
        System.out.println("Ingrese la coordenada x2: ");
        this.x2 = sc.nextDouble();
        System.out.println("Ingrese la coordenada y2: ");
        this.y2 = sc.nextDouble();
        sc.close();
    }

    // Método para calcular la distancia entre dos puntos
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
        return distancia;
    }
}