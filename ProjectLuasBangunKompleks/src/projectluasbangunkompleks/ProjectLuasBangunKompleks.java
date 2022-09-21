/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek persegi
        Persegi p = new Persegi();
        p.sisi = 42;

        // Membuat objek lingkaran
        Lingkaran l1 = new Lingkaran();
        l1.jejari = 21;
        Lingkaran l2 = new Lingkaran();
        l2.jejari = 14;
        Lingkaran l3 = new Lingkaran();
        l3.jejari = 7;

        // Hitung luas bangun datar
        double luasPersegi = p.hitungLuas();
        double luasLingkaran1 = l1.hitungLuas();
        double luasLingkaran2 = l2.hitungLuas();
        double luasLingkaran3 = l3.hitungLuas();

        // Hitung luas bangun datar kompleks
        double luasBangunDatarKompleks1 = luasPersegi + (luasLingkaran1 / 2 * 4);
        double luasBangunDatarKompleks2 = (luasLingkaran2 / 2) - (2 * (luasLingkaran3 / 2));

        // Hasil luas bangun datar kompleks
        System.out.println("Luas Bangun Datar Kompleks 1 = " + luasBangunDatarKompleks1 + " cm2");
        System.out.println("Luas Bangun Datar Kompleks 2 = " + luasBangunDatarKompleks2 + " cm2");
        
    }
    
}
