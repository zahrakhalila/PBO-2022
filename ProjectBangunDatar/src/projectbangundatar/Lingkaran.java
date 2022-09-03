/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class Lingkaran {
    // atribut
    
    double jejari;
    
    // methods
    
    void hitungLuas1(){
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas Lingkaran L1: " + luas + " satuan panjang");
    }
    
    void hitungKeliling1(){
        double keliling = 2 * 3.14 * this.jejari;
        System.out.println("Keliling Lingkaran L1: " + keliling + " satuan panjang");
    }
    
    void hitungLuas2(){
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas Lingkaran L2: " + luas + " satuan panjang");
    }
    
    void hitungKeliling2(){
        double keliling = 2 * 3.14 * this.jejari;
        System.out.println("Keliling Lingkaran L2: " + keliling + " satuan panjang");
    }
    
}
