/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bil
        int[] bil = new int[5];
        
        //input bil oleh user
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i < bil.length; i++){
            System.out.print("Masukkan data : ");
            bil[i] = input.nextInt();
        }
        
        System.out.println("Tampilkan semua data : ");
        
        //menampilkan data
        for (int data : bil){
            System.out.println(data);
        }
        
        /*
        bil[0] = 9;
        bil[1] = 6;
        bil[2] = 3;
        bil[3] = 5;
        bil[4] = 7;
        
        System.out.println(bil[3]);
        */
        
        //cars
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        
        cars[0] = "Opel";
        System.out.println(cars[0]);
        
        //myNum
        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[2]);
    }
    
}
