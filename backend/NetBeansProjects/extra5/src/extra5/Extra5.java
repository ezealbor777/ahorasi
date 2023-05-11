/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import Empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la edad del empleado: ");
    int edad = scanner.nextInt();

    Empleado empleado = new Empleado(nombre, edad);
    System.out.println("El salario inicial de " + empleado.getNombre() + " es: $" + empleado.getSalario());

    empleado.calcularAumento();
    }
    
}
