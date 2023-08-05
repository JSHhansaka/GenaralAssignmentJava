
package com.mycompany.q7;


public class Item {
    private int location;
    private String description;
    
 public Item(int l, String des)
 {
     this.location=l;
     this.description=des;
 }
 
 void setLocation(int l)
 {
     this.location=l;
 }
 int getLocation()
 {
     return location;
 }
 void setDescription(String des)
 {
     this.description=des;
 }
 String getDescription()
 {
     return description;
 }
 
}

