/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("---BANGUN DATAR---");
        // tidak bisa instansiasi karena class abstract
        // BangunDatar b1 = new BangunDatar();
        
        System.out.println("Persegi");
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.tampilHasil();
        
        System.out.println("Lingkaran");
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 21;
        l1.tampilHasil();
        
        System.out.println("Persegi Panjang");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 6;
        pp1.lebar = 14;
        pp1.tampilHasil();
        
        System.out.println("==================");
        System.out.println("---BANGUN RUANG---");
        // tidak bisa instansiasi karena class abstract
        //BangunRuang br1 = new BangunRuang();
        
        System.out.println("Tabung");
        Tabung tb1 = new Tabung();
        tb1.jejari = 8;
        tb1.tinggi = 18;
        tb1.tampilHasil();
        
        System.out.println("Balok");
        Balok ba1 = new Balok();
        ba1.panjang = 15;
        ba1.lebar = 8;
        ba1.tinggi = 7;
        ba1.tampilHasil();
        
        System.out.println("Bola");
        Bola bo1 = new Bola();
        bo1.jejari = 14;
        bo1.tampilHasil();
    }
}
