/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrolguia3.pkg1;

import java.util.Scanner;

/**
 *
 * @author NET
 */
public class extra6 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        
        double sumaEstaturas = 0.0;
        double sumaEstaturasMenor160 = 0.0;
        int contadorEstaturasMenor160 = 0;
        
        for(int i = 0; i < n; i++) {
            System.out.print("Ingrese la estatura en metros de la persona " + (i+1) + ": ");
            double estatura = leer.nextDouble();
            sumaEstaturas += estatura;
            
            if(estatura < 1.6) {
                sumaEstaturasMenor160 += estatura;
                contadorEstaturasMenor160++;
            }
        }
        
        double promedioEstaturas = sumaEstaturas / n;
        double promedioEstaturasMenor160 = 0.0;
        if(contadorEstaturasMenor160 > 0) {
            promedioEstaturasMenor160 = sumaEstaturasMenor160 / contadorEstaturasMenor160;
        }
        
        System.out.println("El promedio de estaturas es: " + promedioEstaturas + " metros.");
        System.out.println("El promedio de estaturas menores a 1.6 metros es: " + promedioEstaturasMenor160 + " metros.");
    }

}