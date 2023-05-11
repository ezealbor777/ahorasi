/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Random;

/**
 *
 * @author NET
 */
public class Cuenta {
     private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
        Random r = new Random();
        this.saldo = r.nextDouble() * 1000; //saldo inicial aleatorio entre 0 y 1000
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No se puede retirar esa cantidad. El saldo es insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de la cuenta de " + titular);
        }
    }
}