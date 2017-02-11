/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islandperimetr;

/**
 *
 * @author Asus
 */
public class Island {
    int islandPerimetr (int [][] arr ) { 
                         //[4][4]
        for ( int i = 0; i < arr.length; i ++ ) { 
            for (int j = 0; j < arr.length; j ++ ) {
                int random = (int) Math.random();
                
            }
        }
        return 0;
    }
    int islandPerimetr2 (int [][] arr ){
        int target = 0;
        int one = 1;
        for ( int i = 0; i < arr.length; i ++ ) { 
            for ( int j = 0; j < arr.length; j ++ ) {
                if ( arr[i][j] == one){
                    int sum = target + 3;
                return sum;
                }
                int sum = target;
            }
        }
        
        
        return target;
    }
}
