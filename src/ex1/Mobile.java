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
public class Mobile extends Product {
 
    private String memory;
    private String os;

    public Mobile(String name, int price, String memory, String os) 
    {
        super(name, price);
        this.memory = memory;
        this.os = os;
    }
    
    public String getMemory()
    {
        return memory;
    }
    
    public String getOs()
    {
        return os;
    }
    
    public void setMemory(String newMemory)
    {
        memory = newMemory;
    }
    
    public void setOs(String newOs)
    {
        os = newOs;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + getName() + ", Price: " + getPricePerBuc() +
                ", Memory: " + memory + ", Os: " + os;                
    }
    
    
}
