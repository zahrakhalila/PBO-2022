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
public class KaryawanA {
    public String nik;
    public String nama;
    private int gapok = 3000000;
    protected int tunjangan;
    protected int masaKerja;
    private int totalGaji;
    
    void setMasaKerja(int mk){
        if (mk > 0){
            this.masaKerja = mk;
        } else {
            System.out.println("Masa kerja tidak valid");
            System.exit(0);
        }
    }
    
    protected void hitungTunjangan(){
        if (masaKerja < 10){
            this.tunjangan = 2000000;
        } else {
            this.tunjangan = 3000000;
        }
    }
    
    private void hitungTotalGaji(){
        this.totalGaji = this.gapok + this.tunjangan;
    }
    
    void printKaryawan(){
        // hitung besar tunjangan 
        this.hitungTunjangan();
        
        // hitung total gaji
        this.hitungTotalGaji();
        
        // print karyawan
        System.out.println("NIK         : " + this.nik);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Masa Kerja  : " + this.masaKerja);
        System.err.println("-------------------------------------");
        System.out.println("Gaji Pokok  : " + this.gapok);
        System.out.println("Tunjangan   : " + this.tunjangan);
        System.err.println("-------------------------------------");
        System.out.println("Total Gaji  : " + this.totalGaji);
    }
}
