/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicles;

/**
 *
 * @author aschultz2026
 */
public class Vehicles {

        public static void main(String[] args) {
        Vehicle thing = new Vehicle("Ford", 125, 5, 40);
        System.out.println(thing);
        Car buggie = new Car();
        buggie.wheels = 4;
        buggie.color = "Light Blue";
        buggie.brandName = "Voltzwagon";
        buggie.speed = 120;
        buggie.passengers = 5;
        buggie.cargoWeight = 30;
        System.out.println(buggie);
    }
}

    class Car extends Vehicle{
        int wheels = 4;
        String color = "";
        public String toString() {
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Wheels: \t" + wheels + "\n" +
            "Color: \t" + color;
            return result;
        }
        
       
    }

    class Boat extends Vehicle{
        int length =  0;
        int sails = 0;
        double knots = 0.0;
        String color = "";
        public String toString() {
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Length(m): \t" + length + "\n" +
            "Sail(s): \t" + sails + "\n" +
            "Speed(knots): \t" + knots + "\n" +
            "Color: \t" + color;
            return result;
    }

    class Airplane extends Vehicle{
        int length = 0;
        String type = "";
        String color = "";
        public String toString() {
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Length(m): \t" + length + "\n" +
            "Type of plane: \t" + type + "\n" +
            "Color: \t" + color;
            return result;
    }

    class Train extends Vehicle{
        int car = 0;
        String color = "";
        public String toString() {
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Car(s): \t" + car + "\n" +
            "Color: \t" + color;
            return result;
        
    }

    class CarrierPigeon extends Vehicle{
        int letter = 0;
        String typePigeon = "";
        public String toString() {
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Letter(s): \t" + letter + "\n" +
            "Type of Pigeon: \t" + typePigeon;
            return result;
        
        
    }


      // The Base Vehicle Class, implements the Speedometer interface
        public class Vehicle implements Speedometer{
            //base (Class wide) variables
            protected String brandName = "";
            protected double speed = 0.0;
            protected int passengers = 0;
            protected double cargoWeight = 0.0;
            //Base default constructor
            public Vehicle(){
            brandName = "";
            speed = 0.0;
            passengers = 0;
            cargoWeight = 0.0;
            }
        public Vehicle(String inBrand, double inSpeed, int inPassengers, double
            inCargo){
            brandName = inBrand;
            speed = inSpeed;
            passengers = inPassengers;
            cargoWeight = inCargo;
            }
        //getters and setters
        public Vehicle(String inBrand){
            brandName = inBrand;
        }
        public String getBrand(){
            return brandName;
        }
        public void setBrandName(String inBrand){
            brandName = inBrand;
        }
        public double getSpeed(){
            return speed;
        }
        public void setSpeed(double inSpeed){
            speed = inSpeed;
        }
        public int getPassengers(){
            return passengers;
        }
        public void setPassengers(int inPassengers){
            speed = inPassengers;
        }
        public double getCargoWeight(){
            return cargoWeight;
        }
        public void setCargoWeight(double inCargoWeight){
            cargoWeight = inCargoWeight;
        }
        //Base toString
        public String toString(){
            String result = "";
            result = "Brand: \t\t\t" + getBrand() + "\n" +
            "Speed: \t" + getSpeed() + "\n" + 
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n";
            return result;
        }
        }
        //the Speedometer interface to show the speed of any vehicle in the same way
        interface Speedometer{
        public void setSpeed(double inSpeed);
        public double getSpeed();
        }
    }
    }
    }
    }
    