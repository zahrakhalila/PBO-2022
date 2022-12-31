/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifier2;

/**
 *
 * @author user
 */
public class AccessModifier2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang p1 = new PersegiPanjang();
        
        p1.lebar = 5;
        p1.panjang = 10;
        
        //tidak bisa diakses karena sudah di private
        p1.hitungLuas();
        p1.hitungKeliling();
        
        p1.output();
    }
    
}
