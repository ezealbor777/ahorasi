/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej6;

import entidad.Curso;
import servicio.CursoServicio;

/**
 *
 * @author NET
 */
public class Guia9ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso = new Curso();
        CursoServicio cursada = new CursoServicio();
        
        cursada.crearCurso(curso);
        System.out.println("ganancia semanal: " + cursada.calcularGananciaSemanal(curso));
    }
    
}
