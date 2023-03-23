/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class ejerecicio1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                double resultadoSuma = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultadoSuma);
                break;
            case 2:
                double resultadoResta = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultadoResta);
                break;
            case 3:
                double resultadoMultiplicacion = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                break;
            case 4:
                double resultadoDivision = dividir(num1, num2);
                System.out.println("El resultado de la división es: " + resultadoDivision);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}