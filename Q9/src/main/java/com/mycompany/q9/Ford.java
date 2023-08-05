/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q9;

/**
 *
 * @author Heshan Hansaka
 */
public class Ford extends Car{
   int year;
   int manufacturerDiscount;
   public  Ford(int year,int manufacturerDiscount,int speed , double regulatPrice , String color){
       super(speed , regulatPrice , color);
       this.year=year;
       this.manufacturerDiscount=manufacturerDiscount;
   }
   public double getSalePrice(double salePrice)
   {
       regulatPrice= salePrice;
       
       return regulatPrice;
   }
}
