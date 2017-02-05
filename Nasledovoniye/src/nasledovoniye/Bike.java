/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasledovoniye;

/**
 *
 * @author Asus
 */

class Bike extends Vehicle {
    int wheels;


    Bike (String s, int p, int m, int wheels){
        
        super(s,p,0,0,m);
        this.wheels = wheels;
        //TODO passengers {1;2}
        if (p > 2 || p < 1) {
            if ( p > 2 ) p = 2;
            if ( p < 1) p = 1;        
        }
        super.setPassengers(p);
       
    }
    
}
    
    
