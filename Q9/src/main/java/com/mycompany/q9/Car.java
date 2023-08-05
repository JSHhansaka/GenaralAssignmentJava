/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q9;

/**
 *
 * @author Heshan Hansaka
 */
public class Car {
     int speed;
     double regulatPrice;
     String color;
     public Car(int speed , double regulatPrice , String color)
     {
         this.speed=speed;
         this.regulatPrice=regulatPrice;
         this.color=color;
     }
    public  double getSalePrice(){
        return regulatPrice;
    }
}
