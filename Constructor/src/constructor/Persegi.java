/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author user
 */
public class Persegi {
    // atribut
    double s;
    
    // constructor
    Persegi(double a) {
        this.s = a;
    }
    // LUAS //
    void luas() {
        double hasilLuas = s*s;
        System.out.println("Luasnya : " + hasilLuas);
    }
    
    // KELILING //
    void keliling() {
        double hasilKeliling = 4*s;
        System.out.println("Kelilingnya : " + hasilKeliling);
    }
}
