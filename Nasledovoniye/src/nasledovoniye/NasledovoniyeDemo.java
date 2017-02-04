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
public class NasledovoniyeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BikesShop magaz = new BikesShop ();
        Bike velosiped = new Bike ("BMX", 5, 20, 2);
        Human Olga = new Human ( 2, 140, 50, 'F' );
        //MonoCycle mcycle = new MonoCycle ();
        System.out.println(velosiped.getPassengers());
        
        if (magaz.canBuy(Olga, velosiped)){
            System.out.println ("Можно купить");
        }
        else { 
            System.out.println("Нельзя купить");
        } 

        //System.out.println(velosiped.fuelcap);
        //System.out.println(velosiped.mpg);
    }
    
}
