/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input data
        
        //persegi panjang
        System.out.println("-PERSEGI PANJANG-");
        
        Scanner persegiPanjang = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double p = persegiPanjang.nextDouble();
        
        System.out.print("Masukkan lebar : ");
        double l = persegiPanjang.nextDouble();
        
        PersegiPanjang pp1 = new PersegiPanjang(p , l);
        pp1.luas();
        pp1.keliling();
        
        //persegi
        System.out.println("--------------------");
        
        System.out.println("-PERSEGI-");
        
        Scanner persegi = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        double s = persegi.nextDouble();
        
        Persegi p1 = new Persegi(s);
        p1.luas();
        p1.keliling();
        
        //lingkaran
        System.out.println("--------------------");
        
        System.out.println("-LINGKARAN-");
        
        Scanner lingkaran = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double j = lingkaran.nextDouble();
        
        Lingkaran l1 = new Lingkaran(j);
        l1.luas();
        l1.keliling();
        
        //segitiga
        System.out.println("--------------------");
        
        System.out.println("-SEGITIGA-");
        
        Scanner segitiga = new Scanner(System.in);
        System.out.print("Masukkan alas : ");
        double a = segitiga.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        double t = segitiga.nextDouble();
        
        Segitiga s1 = new Segitiga(a, t);
        s1.luas();
    }
    
}
