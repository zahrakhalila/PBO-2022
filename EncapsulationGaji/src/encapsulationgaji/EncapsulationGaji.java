/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationgaji;

/**
 *
 * @author user
 */
public class EncapsulationGaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KaryawanA k1 = new KaryawanA();
        k1.nik = "3577015502040001";
        k1.nama = "Zahra Khalila";
        k1.setMasaKerja(12);
        k1.printKaryawan();
        System.out.println("=====================================");
        
        KaryawanB k2 = new KaryawanB();
        k2.nik = "3577022612070002";
        k2.nama = "Hafiz Ihsan";
        k2.setMasaKerja(8);
        k2.printKaryawan();
        System.out.println("=====================================");
    }
    
}
