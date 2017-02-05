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
public class Human {
    private int age;
    private int height;
    private int weight;
    private char sex; //tolerate code!
    
    public Human(int age, int height, int weight, char sex) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }  
}
