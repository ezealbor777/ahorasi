/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author NET
 */
public class FechaService {
    
     public static Date fechaNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento: ");
        System.out.print("Día (1-31): ");
        int dia = sc.nextInt();
        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt() - 1; // Los meses en la clase Date van de 0 a 11
        System.out.print("Año: ");
        int año = sc.nextInt() - 1900; // Se resta 1900 para ajustar el año al formato de la clase Date
        Date fecha = new Date(año, mes, dia);
        return fecha;
    }
     
    public static Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public static int diferencia(Date fecha1, Date fecha2) {
        int años = fecha2.getYear() - fecha1.getYear();
        if (fecha1.getMonth() > fecha2.getMonth()
                || (fecha1.getMonth() == fecha2.getMonth() && fecha1.getDate() > fecha2.getDate())) {
            años--;
        }
        return años;
    }
}