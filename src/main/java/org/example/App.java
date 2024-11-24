package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1L, "milk", 100L, 2L));
        products.add(new Product(2L, "bred", 50L, 3L));
        products.add(new Product(3L, "meat", 200L, 2L));

        System.out.println(products.toString());
    }
}
