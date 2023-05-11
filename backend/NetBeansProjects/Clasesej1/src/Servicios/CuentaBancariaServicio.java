/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author NET
 */
public class CuentaBancariaServicio {
    private CuentaBancaria cuentaBancaria;

    public void crearCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();

        // Generar un saldo aleatorio mayor a 100.000
        double saldoActual = new Random().nextDouble() * (999999 - 100000) + 100000;

        cuentaBancaria = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

        System.out.println("Cuenta creada exitosamente.");
    }

    public void ingresar(double cantidad) {
        if (cuentaBancaria != null) {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + cantidad);
            System.out.println("El ingreso se ha realizado correctamente.");
        } else {
            System.out.println("No se puede realizar la operación. La cuenta no ha sido creada.");
        }
    }

   public void retirar(double cantidad) {
    if (cuentaBancaria != null) {
        if (cuentaBancaria.getSaldoActual() < cantidad) {
            System.out.println("No puede retirar más del saldo disponible (" + cuentaBancaria.getSaldoActual() + ")");
            return;
        }

        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - cantidad);
        System.out.println("El retiro se ha realizado correctamente.");
    } else {
        System.out.println("No se puede realizar la operación. La cuenta no ha sido creada.");
    }
}

    public void extraccionRapida() {
        if (cuentaBancaria != null) {
            double limite = cuentaBancaria.getSaldoActual() * 0.2;

            System.out.println("Ingrese la cantidad a retirar (límite: $" + limite + "):");
            Scanner scanner = new Scanner(System.in);
            double cantidad = scanner.nextDouble();

            if (cantidad > limite) {
                System.out.println("No se puede realizar la operación. La cantidad ingresada supera el límite permitido.");
            } else {
                retirar(cantidad);
            }
        } else {
            System.out.println("No se puede realizar la operación. La cuenta no ha sido creada.");
        }
    }

    public void consultarSaldo() {
        if (cuentaBancaria != null) {
            System.out.println("El saldo actual de la cuenta es: $" + cuentaBancaria.getSaldoActual());
        } else {
            System.out.println("No se puede realizar la operación. La cuenta no ha sido creada.");
        }
    }

    public void consultarDatos() {
        if (cuentaBancaria != null) {
            System.out.println("Número de cuenta: " + cuentaBancaria.getNumeroCuenta());
            System.out.println("DNI del cliente: " + cuentaBancaria.getDniCliente());
            System.out.println("Saldo actual: $" + cuentaBancaria.getSaldoActual());
        } else {
            System.out.println("No se puede realizar la operación. La cuenta no ha sido creada.");
        }
    }
    public void menu() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    int opcion;

    while (!salir) {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear cuenta bancaria");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Realizar extracción rápida");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Consultar datos de la cuenta");
        System.out.println("0. Salir");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                crearCuenta();
                break;
            case 2:
                System.out.println("Ingrese la cantidad a ingresar:");
                double cantidadIngreso = scanner.nextDouble();
                ingresar(cantidadIngreso);
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar:");
                double cantidadRetiro = scanner.nextDouble();
                retirar(cantidadRetiro);
                break;
            case 4:
                extraccionRapida();
                break;
            case 5:
                consultarSaldo();
                break;
            case 6:
                consultarDatos();
                break;
            case 0:
                salir = true;
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
}