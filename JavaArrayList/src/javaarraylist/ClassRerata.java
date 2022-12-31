/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.*;

/**
 *
 * @author user
 */
public class ClassRerata {
    int n;
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i < this.n; i++){
            sum += data[i];
        }
        
        return sum/this.n;
    }
    
    void rerata(){
        
        int[] bil = new int[100];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        this.n = input.nextInt();
        
        for(int i=0; i < this.n; i++){
            System.out.print("Masukkan data ke-" + i + " : ");
            bil[i] = input.nextInt();
        }
        
        System.out.println("Reratanya adalah : " + this.hitungRerata(bil));
    }
}

    

