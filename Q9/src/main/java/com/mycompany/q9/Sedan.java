
package com.mycompany.q9;


public class Sedan extends Car {
    int length;
   
    public Sedan(int speed , double regulatPrice , String color,int legth){
        
        super(speed,regulatPrice,color);
        this.length=legth;  
    } 
    double getSalePrice(int SalePrice)
    {
              regulatPrice= SalePrice;

       if(length>20)
       {
         regulatPrice  =regulatPrice-(regulatPrice*5/100);
         
       }
       else{
         regulatPrice = regulatPrice-(regulatPrice*10/100);
       }
       return regulatPrice;
       
      
    }
    
}
