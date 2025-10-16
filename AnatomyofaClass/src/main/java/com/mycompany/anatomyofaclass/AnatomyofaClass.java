/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anatomyofaclass;

/**
 *
 * @author ASchultz2026
 */
public class AnatomyofaClass {

    public static void main(String[] args) {
        /* 1) What is the difference between a class and an object?
            Class can be designed to represnt real world objects by representing
            a state and behaviors in methods. Objects can be listed under classes
            as variables within the Class stated. 
           2) What happens when you pass an object to a print or println method?
            w
           3) What is the scope of a variable in a method? In a class?
            w
        */
        /*Write a class called Car that has 1 string variable called carBrand
          An int variable called enginePower (in Horse Power)
          A double variable called maxSpeed (in MPH)
          A double variable called price (in $)
          */
        Car myCar = new Car("Toyota Prius", 200, 125, 1000);
        System.out.println(myCar);
        Car oldCar = new Car("VW Bug", 250, 150, 1200);
        System.out.println(oldCar);
        Car futureCar = new Car("Tesla Model 3");
        futureCar.setPower(500);
        futureCar.setSpeed(175);
        futureCar.setPrice(1750);
        System.out.println(futureCar);
        Car dreamCar = new Car("BMW i8");
        dreamCar.setPower(450);
        dreamCar.setSpeed(155);
        dreamCar.setPrice(1500);
        System.out.println(dreamCar);
        
    }
}
class Car {
        //Stating variables carBrand, enginePower, maxSpeed, price
        public String carBrand = "";
        public int enginePower = 0;
        double maxSpeed = 0.0;
        public double price = 0.0; 
        //brand only constructor
        public Car(String inBrand) {
            carBrand = inBrand;
        }
        //full constructor
        public Car(String inBrand, int inPower, double inSpeed, double inPrice) {
            carBrand = inBrand;
            enginePower = inPower;
            maxSpeed = inSpeed;
            price = inPrice;
        }
        
        //set constructors for Power, Speed, and Price
        public void setPower(int inPower){
            enginePower = inPower;
        }
        public void setSpeed(int inSpeed){
            maxSpeed = inSpeed;
        }
        public void setPrice(int inPrice){
            price = inPrice;
        }
        
        
        //print out variables carBrand, enginePower, maxSpeed, and price format for each car
        public String toString() {
            String result = "";
            result = "Car Brand: " + carBrand + "\n" +
                    "HP:" + enginePower + "\n" +
                    "MPH:" + maxSpeed + "\n" +
                    "Price: $" + price;
            return result;
        }
    }
