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
public abstract class Shapes {
            
    private double x; // абсцисса центра
    private double y; // ордината центра
    private double r; // радиус окружности
   
    Shapes () { 
    } 
    Shapes (double x, double y, double r) { 
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
       return x;
    } 
    public double getY(){
        return y;
    }
    public double getR (){
        return r;
    }
    
    public void moveShapes (double a, double b) {
    /* Перемещает центр. Движение фигуры */
        x = x + a;
        y = y + b;
        System.out.println("Фигура "
                + " на оси (x;y) расположена на ("+x+";"+y+") ");
    }
    
    public void moveShapes () {
    /*Перегрузка moveShapes, для параметров
        введённых с клавиатуры */
    
        System.out.println("Окружность "
                + " на оси (x;y) расположена на ("+x+";"+y+") и ёё радиус "+ r );
        System.out.println("");
    }
    
    public void moveShapeRand () {
        /* Рандомно распологает фигуру на оси х,у */
        double a = Math.random()*5;
        double b = Math.random()*5;
        x = x + a;
        y = y + b;
        System.out.println("Фигура "
                + " на оси (x;y) расположена на ("+x+";"+y+") ");
        System.out.println("");
    } 
    
    public double showLength (Circle p) { 
    /* узнаем расстояние между центрами фигур */ 
        return (int) Math.sqrt ( Math.pow (p.getX() - x, 2) + Math.pow (p.getY() - y, 2));
    }
    
}