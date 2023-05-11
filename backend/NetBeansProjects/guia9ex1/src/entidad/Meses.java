/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author NET
 */
public class Meses {
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto;
    
    public Meses() {
        
    } 

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
}
