

package com.mycompany.q10;


public class Q10 {

    public static void main(String[] args) {
        shape s1 = new shape();
        circle c1 = new circle();
        square sq1= new square();
        triangle t1= new triangle();
        
        s1.draw();
        s1.erase();
        
        c1.draw();
        c1.erase();
        
        sq1.draw();
        sq1.erase();
        
        t1.draw();
        t1.erase();
    }
}
