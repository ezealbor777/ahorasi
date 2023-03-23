/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;

/**
 *
 * @author NET
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }
    
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "] = " + vector[i]);
        }
    }
}