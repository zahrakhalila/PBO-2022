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
public class PersegiPanjang {
    // atribut
    double p;
    double l;
    
    //constructor
    PersegiPanjang(double a, double b) {
        this.p = a;
        this.l = b;
    }
    
    // LUAS //
    void luas() {
        double hasilLuas = p*l;
        System.out.println("Luasnya : " + hasilLuas);
    }

    // KELILING //
    void keliling() {
        double hasilKeliling = 2*(p+l);
        System.out.println("Kelilingnya : " + hasilKeliling);
    }
}
