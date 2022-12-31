/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author user
 */
public class MyClass implements MyInterface{
    
    @Override
    public void myMethod1(){
        System.out.println("Hello");
    }
    
    @Override
    public void myMethod2(){
        System.out.println("Hello Juga");
    }
}
