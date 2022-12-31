/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import accessmodifier.A;
import com.sun.corba.se.spi.ior.ObjectKey;

/**
 *
 * @author user
 */
public class C extends A{
    public static void main(String[] args) {
        A obj = new A();
        
        //tidak bisa diakses karena aksesnya default
        obj.a = 3;
        
        //bisa diakses karena aksesnya public
        obj.x = 5;
        obj.y();
        
        //tidak bisa diakses karena bukan subclass
        obj.f = 9;
    }
    
    void hello(){
        C objek = new C(){
        
        //bisa diakses karena subclass
           objek.f = 8;
           objek.g();
        }
    }
    
}
