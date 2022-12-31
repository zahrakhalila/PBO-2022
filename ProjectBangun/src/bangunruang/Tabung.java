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
public class Tabung extends BangunRuang {
    // atribut jejari dan tinggi
    public double jejari;
    public double tinggi;
    
    // method untuk hitung volume tabung
    public double hitungVolume() {
        double volume = 3.14 * this.jejari * this.jejari * this.tinggi;
        return volume;
    }
    
    // method untuk hitung luas permukaan tabung
    public double hitungLuasPermukaan() {
        double luasPermukaan = 2 * 3.14 * this.jejari * (this.jejari + this.tinggi);
        return luasPermukaan;
    }
}
