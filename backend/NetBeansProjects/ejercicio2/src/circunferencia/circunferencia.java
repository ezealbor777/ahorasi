/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author NET
 */
public class circunferencia {
 private double radio;

    // Constructor
    public circunferencia(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear una Circunferencia
    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área de la circunferencia
    public double area() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}