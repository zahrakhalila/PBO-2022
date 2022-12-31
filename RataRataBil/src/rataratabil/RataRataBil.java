/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rataratabil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RataRataBil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double sum = 0;
        int n = 0;
        while(true){
            System.out.print("Masukkan bil bulat : ");
            double bil = input.nextDouble();
            sum += bil;
            n++;
            
            System.out.print("Entri lagi (y/n)? ");
            char ans = input.next().charAt(0);
            
            if(ans == 'n'){
                break;
            }
        }
        
        double rata = sum / n;
        System.out.println("Jumlahnya adalah : " + sum);
        System.out.println("Rata-ratanya adalah : " + rata);
    }
    
}
