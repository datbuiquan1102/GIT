/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DAT CHU TICH
 */
public class Process {

    ArrayList<Category> ListCate = new ArrayList<>();
    ArrayList<Product> listProducts = new ArrayList<>();

    public void addList() {
        Category c;
        Category c2;
        c = new Category("may tinh", "mt");
        c2 = new Category("dien lanh", "dl");
        ListCate.add(c);
        ListCate.add(c2);
        Product p1 = new Product("may tinh xach tay A", c.getTag(), 12.0);
        Product p2 = new Product("laptop X", c.getTag(), 13.0);
        Product p3 = new Product("ac 2", c.getTag(), 13.0);
        Product p4 = new Product("ultrabook EZ", c.getTag(), 16.0);
        Product p5 = new Product("tu lanh e", c2.getTag(), 11.5);
        Product p6 = new Product("dieu hoa nhiet do b", c2.getTag(), 12.0);
        listProducts.add(p1);
        listProducts.add(p2);
        listProducts.add(p3);
        listProducts.add(p4);
        listProducts.add(p5);
        listProducts.add(p6);
    }
    public ArrayList<Product> SearchByCategoryTag(String tag) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product pro : listProducts) {
            if (pro.getCategoryTag().toUpperCase().contains(tag.toUpperCase())) {
                list.add(pro);
                Collections.sort(list, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        int s = (int) (o2.getPrice() > o1.getPrice() ? 1 : -1);
                         if (o2.getPrice() == o1.getPrice()) {
                            return o1.getName().compareTo(o2.getName());
                        }
                        return s;
                    }
                });
            }
        }

        return list;
    }

    public ArrayList<Category> getListCate() {
        return ListCate;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

}
