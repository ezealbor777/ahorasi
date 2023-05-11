/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, 
le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso.
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, 
la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package servicio;

import entidad.Curso;
import java.util.Scanner;


/**
 *
 * @author NET
 */
public class CursoServicio {
    
    Scanner scanner = new Scanner(System.in);

    public void cargarAlumnos(Curso curso) {
        String[] alumnos = new String[5];
        System.out.println("Ingrese los nombres de los alumnos:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
        curso.setAlumnos(alumnos);
    }

     public void crearCurso(Curso curso1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso: ");
        curso1.setNombreCurso(sc.next());
        System.out.println("Ingrese la cantidad de horas por día: ");
        curso1.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("Ingrese la cantidad de días por semana: ");
        curso1.setCantidadDiasPorSemana(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el turno (mañana o tarde): ");
        System.out.println("elija su turno: ");
         System.out.println("1: mañana ");
         System.out.println("2: tarde ");
         int opcion = sc.nextInt();
         while(opcion != 1 && opcion !=2){ 
             System.out.println("opcion incorrecta ingrese las opciones indicadas");  
            opcion = sc.nextInt();
         }
         switch(opcion){
             case 1: curso1.setTurno("mañana");
             break;
             case 2: curso1.setTurno("tarde");
             break;
         }
        System.out.println("Ingrese el precio por hora: ");
         curso1.setPrecioPorHora(sc.nextDouble());
         cargarAlumnos(curso1); 
         
        }

    public double calcularGananciaSemanal(Curso curso) {
        int cantidadHorasPorSemana = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana();
        double gananciaSemanal = cantidadHorasPorSemana * curso.getPrecioPorHora() * curso.getAlumnos().length;
        return gananciaSemanal;
    }
}