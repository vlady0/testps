/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.*;

/**
 *
 * @author Vlad
 */
public class Cart {
   
    HashMap<Product, Integer> products = new HashMap<Product, Integer>();  
    private int totalPrice = 0;
    
    public void addProduct(Product p, int quantity)
    {    
        products.put(p, quantity);
    }
    
   public int getTotalPrice()
   {
       for (Map.Entry<Product, Integer> entry : products.entrySet()) 
           totalPrice += entry.getKey().getPrice(entry.getValue());
       return totalPrice;
   }
   
    @Override
   public String toString()
   {
       getTotalPrice();
       for (Map.Entry<Product, Integer> entry : products.entrySet()) 
           System.out.println(entry.getKey() + ", Quantity: " +entry.getValue());
       return "Total price: " + Integer.toString(totalPrice);
   }   
}
