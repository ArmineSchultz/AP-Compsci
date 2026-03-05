/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportation;

/**
 *
 * @author Owner
 */
public class Transportation {

    public static void main(String[] args) {
        Vehicle thing = new Vehicle("Ford", 125, 5, 40);
        System.out.println(thing);
        
        Car buggie = new Car();
        buggie.brandName = "Voltzwagon";
        buggie.speed = 120;
        buggie.passengers = 5;
        buggie.cargoWeight = 65;
        System.out.println(buggie);
        
        ElectricCar tesla = new ElectricCar();
        tesla.brandName = "Tesla";
        tesla.speed = 180;
        tesla.passengers = 5;
        tesla.cargoWeight = 80;
        tesla.color = "Grey";
        tesla.batteryBrand = "Tesla";
        System.out.println(tesla);
                
        Boat dinghy = new Boat();
        dinghy.brandName = "Dinghy";
        dinghy.speed = 34.5;
        dinghy.passengers = 2;
        dinghy.cargoWeight = 30;
        dinghy.color = "Red";
        dinghy.sails = 1;
        dinghy.knots = 30;
        System.out.println(dinghy);

        Catamaran catamaran = new Catamaran();
        catamaran.brandName = "Catamaran";
        catamaran.speed = 34.5;
        catamaran.passengers = 7;
        catamaran.cargoWeight = 50;
        catamaran.sails = 2;
        catamaran.knots = 30;
        catamaran.hulls = 2;
        System.out.println(catamaran);
        
        Airplane B2 = new Airplane();
        B2.brandName = "B-2 Spirit";
        B2.speed = 627;
        B2.passengers = 2;
        B2.cargoWeight = 100;
        B2.length = 20;
        B2.color = "Black";
        System.out.println(B2);
        
        Airplane Boeing = new Airplane();
        Boeing.brandName = "Boeing 737";
        Boeing.speed = 683;
        Boeing.passengers = 162;
        Boeing.cargoWeight = 2500;
        Boeing.length = 129.6;
        System.out.println(Boeing);
        
        Train train = new Train();
        train.brandName = "Train";
        train.speed = 59;
        train.passengers = 30;
        train.cargoWeight = 200;
        System.out.println(train);
        
        CarrierPigeon pigeon = new CarrierPigeon();
        pigeon.brandName = "Carrier Pigeon";
        pigeon.speed = 60;
        pigeon.passengers = 0;
        pigeon.cargoWeight = 50;
        pigeon.letters = 2;
        System.out.println(pigeon);
        
    }
}
class Car extends Vehicle{
    int wheels = 4;
    String color = "Light Blue";
public String toString(){
    String result ="";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Wheels: \t" + wheels + "\n" +
            "Color: \t" + color + "\n";
    return result;
}
}
class ElectricCar extends Car{
    String batteryBrand = "";
public String toString(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Wheels: \t" + wheels + "\n" +
            "Color: \t" + color + "\n" +
            "Battery Brand: \t" + batteryBrand + "\n";
    return result;
    
}
}
class Boat extends Vehicle{
    int sails = 0;
    double knots = 0.0;
    String color = "White";
public String toString(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Sails: \t" + sails + "\n" +
            "Speed (Knots):" + knots + "\n" +
            "Color: \t" + color + "\n";
    return result;
}
}
class Catamaran extends Boat{
    int hulls = 0;
public String toString(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Sails: \t" + sails + "\n" +
            "Speed (Knots):" + knots + "\n" +
            "Hull(s): \t" + hulls + "\n"+
            "Color: \t" + color + "\n";
    return result;
}
}

class Airplane extends Vehicle{
    double length = 0.0;
    String color = "White";
public String toString(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Length (m): \t" + length + "\n" +
            "Color: \t" + color + "\n";
    return result;
}
}

class Train extends Vehicle{
    int cars = 0;
    String color = "Black";
public String toStrin(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (lbs): \t" + getCargoWeight() + "\n" +
            "Cars: \t" + cars + "\n" +
            "Color: \t" + color + "\n";
    return result;
}
}
class CarrierPigeon extends Vehicle{
    int letters = 0;
    String color = "Grey";
    double distance = 0.0;
public String toString(){
    String result = "";
    result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
            "Passengers: \t" + getPassengers() + "\n" +
            "Cargo (grams): \t" + getCargoWeight() + "\n" +
            "Letters: \t" + letters + "\n" +
            "Color: \t" + color + "\n";
    return result;
}
}
//The Base Vehicle Clas, implements the Speedometer interface
class Vehicle implements Speedometer{
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
    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inCargo){
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
        result = "Brand: \t\t\t" + getBrand() + "\n"+
            "Speed (mph): \t" + getSpeed() + "\n" +
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