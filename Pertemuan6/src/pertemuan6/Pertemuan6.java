/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //wrapper class
        int b = 30;
        Integer a = 30;
        Double pi = 3.14;
        
        System.out.println(a.toString());
        System.out.println(pi.intValue());
        
        //input java
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bil 1 : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bil 2 : ");
        int bil2 = input.nextInt();
        
        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahannya : " + hasil);

    }
    
}
