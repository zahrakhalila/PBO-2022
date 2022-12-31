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
public class Lingkaran {
    // atribut
    double r;
    
    // constructor
    Lingkaran(double a) {
        this.r = a;
    }
    
    // LUAS //
    void luas() {
        double hasilLuas = 3.14*r*r;
        System.out.println("Luasnya : " + hasilLuas);
    }
    
    // KELILING //
    void keliling() {
        double hasilKeliling = 2*3.14*r;
        System.out.println("Kelilingnya : " + hasilKeliling);
    }
}
