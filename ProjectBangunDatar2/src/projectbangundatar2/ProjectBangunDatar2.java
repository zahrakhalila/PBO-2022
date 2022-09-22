/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PERSEGI PANJANG //
        System.out.println("-PERSEGI PANJANG-");
        PersegiPanjang PP = new PersegiPanjang();
        
        System.out.println("a. Luas : " + PP.luas(10, 5));
        System.out.println("   Keliling : " + PP.keliling(10, 5));
        
        System.out.println("b. Luas : " + PP.luas(3.6, 8));
        System.out.println("   Keliling : " + PP.keliling(3.6, 8));
        
        System.out.println("c. Luas : " + PP.luas(6, 8.3));
        System.out.println("   Keliling : " + PP.keliling(6, 8.3));
        
        System.out.println("d. Luas :" + PP.luas(5.6, 8.8));
        System.out.println("   Keliling : " + PP.keliling(5.6, 8.8));
    
        
        // PERSEGI //
        System.out.println("-PERSEGI-");
        Persegi P = new Persegi();
        
        System.out.println("a. Luas : " + P.luas(4.5));
        System.out.println("   Keliling : " + P.keliling(4.5));
        
        System.out.println("b. Luas : " + P.luas(7));
        System.out.println("   Keliling : " + P.keliling(7));
        
        // LINGKARAN //
        System.out.println("-LINGKARAN-");
        Lingkaran L = new Lingkaran();
        
        System.out.println("a. Luas : " + L.luas(5));
        System.out.println("   Keliling : " + L.keliling(5));
        
        System.out.println("b. Luas : " + L.luas(7.4));
        System.out.println("   Keliling : " + L.keliling(7.4));
        
        // SEGITIGA //
        System.out.println("-LUAS SEGITIGA-");
        Segitiga S = new Segitiga();
        System.out.println("a. " + S.luas(8, 10));
        System.out.println("b. " + S.luas(8, 11.5));
        System.out.println("c. " + S.luas(12.2, 9));
        System.out.println("d. " + S.luas(13.9, 20.7));
    }
    
}
