

package com.mycompany.q3;

import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      
        System.out.println("Enter a fahrenheit");
      float fahrenheit = scanner.nextFloat();
     
      float Celsius =(5.0f/9.0f)* (fahrenheit-32.0f);
      
      System.out.println("Cersius is" + Celsius);
    }
}
