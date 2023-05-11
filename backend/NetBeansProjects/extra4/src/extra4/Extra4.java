/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4;

import Cuenta.Cuenta;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre del titular de la cuenta: ");
    String titular = scanner.nextLine();
    Cuenta cuenta = new Cuenta(titular);
    System.out.println("El saldo inicial de la cuenta de " + cuenta.getTitular() + " es " + cuenta.getSaldo());

    System.out.print("Ingrese la cantidad a retirar: ");
    double cantidad = scanner.nextDouble();
    cuenta.retirar_dinero(cantidad);

    System.out.println("El saldo actual de la cuenta de " + cuenta.getTitular() + " es " + cuenta.getSaldo());
    }
    
}
