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
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        A.panjang = 10;
        A.lebar = 7;
        
        A.hitungLuasA();
        A.hitungKelilingB();
        
        // persegi panjang B
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 14;
        B.lebar = 9;

        B.hitungLuasB();
        B.hitungKelilingB();
        
        // persegi panjang C
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;

        C.hitungLuasC();
        C.hitungKelilingC();
        
        // persegi panjang D
        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;

        D.hitungLuasD();
        D.hitungKelilingD();
        
        //lingkaran L1
        Lingkaran L1 = new Lingkaran();
        L1.jejari = 6;
        
        L1.hitungLuas1();
        L1.hitungKeliling1();
        
        //lingkaran L2
        Lingkaran L2 = new Lingkaran();
        L2.jejari = 12;
        
        L2.hitungLuas2();
        L2.hitungKeliling2();
        
    }
    
}
