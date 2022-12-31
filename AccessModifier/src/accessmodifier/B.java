/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifier;

/**
 *
 * @author user
 */
public class B {
    public static void main(String[] args) {
        A obj = new A();
        
        //bisa diakses karena berada di dalam package yang sama 
        obj.a = 5;
        obj.b();
        
        //tidak bisa diakses karena access modifier class A private 
        obj.z = 6;
        
        // bisa diakses karena berada di dalam package yang sama dengan class A
        obj.c = 8;
    }
}
