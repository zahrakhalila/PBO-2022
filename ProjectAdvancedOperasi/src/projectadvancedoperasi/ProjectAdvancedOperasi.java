/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi x = new Operasi();

            System.out.println(x.jumlahkan(3, 4));
            System.out.println(x.jumlahkan(4, 7, -9));
            System.out.println(x.jumlahkan(3.4, -0.002, 0.12313));
            
            System.out.println(x.kalikan(9, 7));
            System.out.println(x.kalikan(5.8, 3.006));
            System.out.println(x.kalikan(6.0123, -8.095, 2.5));

    }
    
}
