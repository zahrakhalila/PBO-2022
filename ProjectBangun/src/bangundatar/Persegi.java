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
public class Persegi extends BangunDatar {
    // atribut sisi
    public double sisi;
    
    // method untuk hitung luas persegi
    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    // method untuk hitung keliling persegi
    public double hitungKeliling(){
        double keliling = 4 * this.sisi;
        return keliling;
    }
}
