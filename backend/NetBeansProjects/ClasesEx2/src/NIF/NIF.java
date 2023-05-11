/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIF;



/**
 *
 * @author NET
 */
public class NIF {
      private long numeroDni;
    private char letra;

    public NIF() {}

    public NIF(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void calcularLetra() {
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
                'H', 'L', 'C', 'K', 'E' };
        int resto = (int) (this.numeroDni % 23);
        this.letra = letras[resto];
    }

    public void mostrar() {
        String nifCompleto = String.format("%08d", this.numeroDni) + "-" + this.letra;
        System.out.println(nifCompleto);
    }
}