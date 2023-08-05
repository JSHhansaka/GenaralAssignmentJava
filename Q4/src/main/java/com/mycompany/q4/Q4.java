

package com.mycompany.q4;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in) ;
        System.out.println("Enter three numbers");
       int num1=scanner.nextInt();
       int num2=scanner.nextInt();
       int num3=scanner.nextInt();
       
       int sum=num1+num2+num3;
        System.out.println("Sum is : " + sum);
        
       float avg = (num1+num2+num3)/3;
        System.out.println("Average : "+ avg );
        
        int product = (num1*num2*num3);
        System.out.println("Product is" + product);
       
        int smallest=num1;
        if(num2<smallest){
             smallest=num2;
        }
        
         if(num3 <smallest){
             smallest = num3;
           
          }
         System.out.println("smallest number is :"+ smallest);
         
         int largest =num1;
         
         if (largest<num2)
         {
             largest = num2;
         }
         if   (largest<num3)
         {
             largest=num3;
         }
        System.out.println("Largest number is: "+ largest);
       
    }
}
