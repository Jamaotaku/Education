/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Point extends Shapes {

    /**
     *
     * @param p
     */
    Point (double x, double y) { 
        super (x,y,0);
    }
    Point () {
    }

    public double showLength (Point p) {
    /* Расстояние между точками */ 
        return Math.sqrt ( Math.pow (p.getX() - getX(), 2) + Math.pow (p.getY() - getY(), 2));
    }
    public void showQuarter () { 
    /* показывает в какой четверти расположена точка */
        if (getX() > 0 && getY() > 0) { 
            System.out.println("Точка в первой четверти");
        } else if (getX() > 0 && getX() < 0 ) {
            System.out.println("Точка во второй четверти");
        } else if (getX() < 0 && getY() < 0 ) { 
            System.out.println("Точка во третей четверти");
        } else { 
            System.out.println("Точка в четвёртой четверти");
        }
    }
    public void showSimmetr ( Point p ) {
    /* Симмтричны точки на плоскости */
        if (Math.abs (getX()) == Math.abs(p.getX()) && (Math.abs(getY())) == Math.abs(p.getY())){
            System.out.println("Точки симметричны");
        }
        else {
            System.out.println("Точки не симметричны");
        }
    }
}
