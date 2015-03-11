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
public class Laptop extends Product{
    
    private String processor;
    private String screenSize;
    
    public Laptop(String name, int price, String processor, String screenSize)
    {
        super(name,price);
        this.processor = processor;
        this.screenSize = screenSize;        
    }
    
    public String getProcessor()
    {
        return processor;
    }
    
    public String getScreenSize()
    {
        return screenSize;
    }
    
    public void setProcessor(String newProcessor)
    {
        processor = newProcessor;
    }
    
    public void setScreenSize(String newScreenSize)
    {
        screenSize = newScreenSize;                
    }
    
    @Override
    public String toString()
    {
        return "Name: " + getName() + ", Price: " + getPricePerBuc() 
                +  ", Processor: " + processor + ", ScreenSize: " + screenSize;                
        
    }
}
