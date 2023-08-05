
package com.mycompany.q6;


public class Date {
    private int month;
    private int date;
    private int year;
    
    public Date(int m,int d , int year){
    this.month=m;
    this.date=d;
    this.year=year;
}
    void setMounth(int month)
    {
        this.month=month;
    }
    int getMounth(){
        return month;
    }
    void setDate(int date){
        this.date=date;
    }
    int getDate(){
        return date;
    }
    void setYear(int year){
        this.year=year;
   
 }
    int getYear(){
        return year;
    }
    void display(){
        System.out.println("month: "+ month);
        System.out.println("date: "+ date);
        System.out.println("year: " +year);
    }
}
