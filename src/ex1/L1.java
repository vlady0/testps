/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Vlad
 */
public class L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop p1 = new Laptop("Laptop Dell", 200, "I3 2.0 GHZ", "17 inch");
        Laptop p2 = new Laptop("Laptop Asus", 800, "I5 2.7 GHZ", "20 inch");
        
        Mobile m1 = new Mobile("Samsung", 500, "8 Gb", "Android");
        Mobile m2 = new Mobile("Iphone", 800, "16 Gb", "IOS");
          
        Cart c = new Cart();
        c.addProduct(p1, 10);
        c.addProduct(p2, 2);
        c.addProduct(m1, 5);
        c.addProduct(m2, 10);
        
        System.out.println(c.toString());                       
    }
    
}
