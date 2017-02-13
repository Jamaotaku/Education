/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledemo;

/**
 *
 * @author Asus
 */
public class Circle extends Shapes {
    
    Circle (double x, double y, double r) { 
        super (x,y,r);
    }
    
    Circle (){
    public void printCircle () {
        System.out.println("Окружность с центром ("+ getX()+";"+getY()+") и радиусом " + getR());
                
    } 

    public void zoomCircle (double r) {
    /* Масштабируем круг, преоброзование подобия с коэфцииентом k */
        double radius = getR() * r;
        System.out.print("Масштаб круга увеличен в " + radius + " раз");
    }
    
    public double squareCircle () {
       /* Площадь окружности */ 
        double s = Math.PI * getR() * getR();
        return s;
    }
    
    public boolean equalsCircle (Circle cir) {
    /* метод сравнения окружностей 2 кругов */
        if (this.squareCircle() == cir.squareCircle()){
            System.out.println("Площади окружностей равны");
            return true;
        } else {
            System.out.println("Площади окружностей не равны");
            return false;
        }  
    }
    
    public double lengthCircle () {
    /* длина окружности */   
        double x = 2 * Math.PI * getR();
        return x;
    }
    
    public void moveCircle (double a, double b, double c) {
    /* Перемещает центр. для круга */
    double x = getX();
    double y = getY();
        x = x + a;
        y = y + b;
        c = getR();
        System.out.println("Фигура "
                + " на оси (x;y) расположена на ("+x+";"+y+") и ёё радиус " + c);
    }
}
