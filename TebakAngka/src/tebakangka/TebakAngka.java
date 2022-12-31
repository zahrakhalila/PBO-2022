/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

/**
 *
 * @author user
 */

import java.util.*;

public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a = (int)(Math.random()*100);
        int nyawa = 5;
        
        System.out.println("------------------------------");
        System.out.println("PERMAINAN TEBAK BILANGAN");
        System.out.println("------------------------------");
        System.out.println("Anda hanya diberi kesempatan sebanyak 5 kali untuk menebak");
        
        while(true){
            System.out.print("Masukkan Bilangan Tebakan Anda : ");
            int b = input.nextInt();
            
            if (b == a) {
                System.out.println("Bilangan Tebakan Anda Benar... Yeay!");
                break;
            } else if (b > a) {
                System.out.println("Yahh... Bilangan Tebakan Anda Terlalu Besar");
            } else {
                System.out.println("Hehe... Bilangan Tebakan Anda Terlalu Kecil");
            }
            
            if (nyawa > 0){
                nyawa -= 1;
                if (nyawa == 0){
                    System.out.println("GAME OVER");
                    break;
                }
            }
        }
    }
    
}
