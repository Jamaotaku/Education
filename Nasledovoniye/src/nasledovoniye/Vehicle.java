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
class Vehicle {
    

    
    String name;
    private int passengers; // количество пассажиров
    private int fuelcap;  // емкость бензобака
    private int mpg;    // потребление топлива в милях на галлон
    private int maxspeed; // максимальная скорость

        
    Vehicle( String name, int p, int f, int g, int m ) {      
        this.name = name; 
        if (p < 0) {
         passengers = 0;
        }
        else {
            passengers = p;
        } // количество пассажиров
        fuelcap = f; // емкость бензобака
        mpg = g; // потребление топлива в милях на галлон
        maxspeed = m; // максимальная скорость
}
    int range (){ 
        return mpg*fuelcap; /*метод вычисления дальности действия ТС с полным баком */
    }  
    
    double fuelneeded(int miles){
       return (double) miles/mpg; /* потребление топлива (галлон на милю) */
}   
    
    double getFinish (int miles){
       return (double) miles/maxspeed*60; /* из А в пункт Б, величина в минутах */
}   

    public String getName() {
        return name;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public int getMaxspeed() {
        return maxspeed;
    }
    
    void setPassengers(int p){
        if (p < 0) {
            this.passengers = 0;
        }
        else 
            this.passengers = p;
    }


}
