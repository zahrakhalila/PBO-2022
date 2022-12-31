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
public class PersegiPanjang extends BangunDatar{
    // atribut panjang dan lebar
    public double panjang;
    public double lebar;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = this.panjang * this.lebar;
        return luas;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungKeliling(){
        double keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }
}
