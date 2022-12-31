/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacebangun;

/**
 *
 * @author user
 */
public class Segitiga extends BangunDatar {
   
    // atribut
    public int alas;
    public int tinggi;
     
    // methods
    @Override
    public double hitungLuas(){
        return this.alas * this.tinggi / 2.0;
    }
     
    @Override
    public void tampilHasil(){
        System.out.println("Segitiga");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("============");
    }

}
