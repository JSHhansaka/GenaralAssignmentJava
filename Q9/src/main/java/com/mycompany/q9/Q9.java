
package com.mycompany.q9;

public class Q9 {

    public static void main(String[] args) {
        // call sedan class
        Sedan s1 = new Sedan(220,10000000,"black",25) ;
        //call ford class
        Ford f1= new Ford(2022,100000,260,30000000,"red");
        //call car main class
        Car c1= new Car(280,40000000,"black");
        
        System.out.println("Sedan Sale Price: $" + s1.getSalePrice());
        System.out.println("Ford 1 Sale Price: $" + f1.getSalePrice());
        System.out.println("Car Sale Price: $" + c1.getSalePrice());
    }
      
}
