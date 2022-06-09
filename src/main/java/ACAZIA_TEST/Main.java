/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACAZIA_TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DAT CHU TICH
 */
public class Main {

    public static void main(String[] args) {
        Process ps = new Process();
        ps.addList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Get List");
            System.out.println("2. Search By CategoryTag");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    ShowListCate(ps.getListCate());
                    ShowListPro(ps.getListProducts());
                    break;
                case 2:
                    System.out.println("Input: ");
                    String tag = sc.nextLine();
                    ShowListPro(ps.SearchByCategoryTag(tag));
                    break;

            }

        }
    }

    public static void ShowListCate(ArrayList<Category> ct) {
        for (Category category : ct) {
            System.out.println(category);
        }
    }

    public static void ShowListPro(ArrayList<Product> pr) {
        for (Product pro : pr) {
            System.out.println(pro);
        }
    }

}
