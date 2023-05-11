/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import java.util.HashSet;

/**
 *
 * @author NET
 */
public class Paises {
       private HashSet<String> paises;

    public Paises() {
    }

    public Paises(HashSet<String> paises) {
        this.paises = paises;
    }

    public HashSet<String> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<String> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + '}';
    }
}
