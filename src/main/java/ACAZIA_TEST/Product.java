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
public class Product extends Category{
    private String name;
    private String categoryTag;

    public Product(String name, String categoryTag, double price) {
        super(categoryTag, price);
        this.categoryTag = categoryTag;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    @Override
    public String toString() {
        return "{" + "name = " + name + ", categoryTag ="  + categoryTag + " Price = " + super.getPrice() +'}';
    }

    
    
    
    
    
    
    
    
}
