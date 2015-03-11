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
public abstract class Product {
    
    private String name;
    private int price;
    
    public Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
    public int getPrice(int quantity)
    {
        if ( quantity < 3 )
            return price * quantity * 3;
        else if (quantity >=3 && quantity < 6)
            return price * quantity *2;
        else
            return price;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + ", Price: " + price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPricePerBuc()
    {
        return price;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
}
