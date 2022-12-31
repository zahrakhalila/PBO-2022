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
public class A {
    
    //access modifier public
    public int x;
    public void y(){
        System.out.println("Hello");
    }
    
    //access modifier default
    int a;
    void b(){
        System.out.println("Hello");
    }
    
    //access modifier private
    private int z;
    
    //access modifier protected
    protected int f;
    protected void g(){
        System.out.println("Hello");
    }
}
