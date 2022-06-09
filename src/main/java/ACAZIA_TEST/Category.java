/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_TEST;

/**
 *
 * @author DAT CHU TICH
 */
public class Category {
    private String name;
    String tag;
    private double price;

    public Category() {
    }    
    
    public Category(String tag, double price){
        this.tag = tag;
        this.price = price;
    }

     public Category(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + "name = " + name + ", tag = " + tag + '}';
    }
    
    
   
    
}
