/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author user
 */
public class Lingkaran extends BangunDatar{
    // atribut jari-jari
    public double jejari;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = 3.14 * this.jejari * this.jejari;
        return luas;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungKeliling(){
        double keliling = 2 * 3.14 * this.jejari;
        return keliling;
    }
}
