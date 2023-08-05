

package com.mycompany.q6;


public class Q6 {

    public static void main(String[] args) {
       Date d1 =new Date(06,03,2023);
       d1.display();
       Date d2= new Date(0,0,0);
       d2.setDate(22);
       d2.setMounth(03);
       d2.setYear(2023);
       
        System.out.println("Date is");
        System.out.println("Date :" + d2.getDate());
        System.out.println("Month" + d2.getMounth());
        System.out.println("Year"+ d2.getYear());
    }
    
}
