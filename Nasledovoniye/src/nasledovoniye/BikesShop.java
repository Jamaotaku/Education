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
public class BikesShop {
    
    boolean canBuy (Human human,Bike bike) { 
        
        if ( human.getAge() < 3 ) return false;
        return true;
    }   
}
