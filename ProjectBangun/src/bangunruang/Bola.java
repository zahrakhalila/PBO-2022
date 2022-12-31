/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author user
 */
public class Bola extends BangunRuang {
    // atribut jejari
    public double jejari;
    
    // method untuk hitung volume bola
    public double hitungVolume() {
        double volume = 4/3 * 3.14 * this.jejari * this.jejari * this.jejari;
        return volume;
    }
    
    // method untuk hitung luas permukaan bola
    public double hitungLuasPermukaan() {
        double luasPermukaan = 4 * 3.14 * this.jejari * this.jejari;
        return luasPermukaan;
    }
}
