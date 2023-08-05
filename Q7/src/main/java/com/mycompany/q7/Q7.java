
 
package com.mycompany.q7;


public class Q7 {

    public static void main(String[] args) {
      Item i1=new Item(1,"description");
        System.out.println("Item location" +i1.getLocation());
        System.out.println("Item description"+ i1.getDescription());
        
        Monster monster= new Monster("Monster description",2);
        System.out.println("Monster location:"+ monster.getDescription());
        System.out.println("Monster description:"+ monster.getLocation());
            
      
    }
}
