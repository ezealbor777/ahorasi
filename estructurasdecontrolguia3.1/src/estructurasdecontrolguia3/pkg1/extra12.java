/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrolguia3.pkg1;

/**
 *
 * @author NET
 */
public class extra12 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digit1 = Integer.toString(i);
                    String digit2 = Integer.toString(j);
                    String digit3 = Integer.toString(k);
                    if (digit1.equals("3")) {
                        System.out.print("E-");
                    } else {
                        System.out.print(digit1 + "-");
                    }
                    if (digit2.equals("3")) {
                        System.out.print("E-");
                    } else {
                        System.out.print(digit2 + "-");
                    }
                    if (digit3.equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(digit3);
                    }
                    System.out.println();
                }
            }
        }
    }
}