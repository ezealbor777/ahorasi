/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.Random;

/**
 *
 * @author NET
 */
public class Empleado {
     private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = generarSalarioAleatorio();
    }

    private double generarSalarioAleatorio() {
        Random random = new Random();
        return 80000 + (100000 - 80000) * random.nextDouble();
    }

    public void calcularAumento() {
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        salario += aumento;
        System.out.println("El nuevo salario de " + nombre + " es: $" + salario);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}