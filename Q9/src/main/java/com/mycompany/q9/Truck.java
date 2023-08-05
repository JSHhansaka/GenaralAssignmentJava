/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q9;

/**
 *
 * @author Heshan Hansaka
 */
public class Truck extends Car {
    int weight;
    public Truck(int speed,double regulatPrice, String color, int weight)
    {
        super(speed,regulatPrice,color);
        this.weight=weight;
        
    }
    @Override
    public double getSalePrice(){
        
        if(weight>2000)
        {
            return (regulatPrice)-(regulatPrice*10/100);
        }
        else
        {
             return (regulatPrice)-(regulatPrice*20/100);
        }
    }
}
