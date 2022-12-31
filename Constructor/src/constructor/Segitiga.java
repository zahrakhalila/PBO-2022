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
public class Segitiga {
    // atribut
    double a;
    double t;
    
    // constructor
    Segitiga(double b, double c) {
        this.a = b;
        this.t = c;
    }
    
    // LUAS
    void luas() {
        double hasilLuas = a*t/2;
        System.out.println("Luasnya : " + hasilLuas);
    }
}
