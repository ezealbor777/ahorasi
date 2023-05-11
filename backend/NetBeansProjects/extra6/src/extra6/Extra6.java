/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del lado 1 del rectángulo: ");
        double lado1 = leer.nextDouble();
        System.out.print("Ingresa el tamaño del lado 2 del rectángulo: ");
        double lado2 = leer.nextDouble();
        
        Rectangulo rectangulo1 = new Rectangulo(lado1, lado2);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
        
        leer.close();
    }
}
    
    
