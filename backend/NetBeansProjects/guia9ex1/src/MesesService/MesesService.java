/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MesesService;

import entidad.Meses;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NET
 */
public class MesesService {
    
   public void cargarmesSecreto(Meses mes){
       Random random =  new Random();
        int indiceAleatorio = random.nextInt(mes.getMeses().length);
        String mesSecreto = mes.getMeses()[indiceAleatorio];
        mes.setMesSecreto(mesSecreto);
    }
   
   public void adivinarMes(Meses mes){
         Scanner sc = new Scanner(System.in);
     String mesSecreto = mes.getMesSecreto();
     String mesIngresado;
     int intentos = 0;
     final int MAX_INTENTOS = 3;
    
     System.out.print("Adivine el mes secreto." + "\n Introduzca el nombre del mes en minúsculas: ");
     mesIngresado = sc.nextLine();
     intentos++;
    
     while (!mesIngresado.equals(mesSecreto) && intentos < MAX_INTENTOS) {
        System.out.print("Incorrecto. Intente de nuevo: ");
        mesIngresado = sc.nextLine();
        intentos++;
     }
    
     if (intentos == MAX_INTENTOS && !mesIngresado.equals(mesSecreto)) {
        System.out.println("GAME OVER");
    } else {
        System.out.println("¡Ha acertado!");
    
    }
   }    
}
   

