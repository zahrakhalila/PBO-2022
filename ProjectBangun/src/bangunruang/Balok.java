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
public class Balok extends BangunRuang {
    // atribut panjang, lebar, tinggi
    public double panjang;
    public double lebar;
    public double tinggi;
    
    // method untuk hitung volume balok
    public double hitungVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    // method untuk hitung luas permukaan balok
    public double hitungLuasPermukaan() {
        double luasPermukaan = 2 * (this.panjang*this.lebar + this.lebar*this.tinggi + this.panjang*this.tinggi);
        return luasPermukaan;
    }
}
