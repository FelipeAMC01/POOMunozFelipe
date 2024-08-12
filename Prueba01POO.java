/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba01poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FelixDDP
 */
public class Prueba01POO {

    public static void main(String[] args) {
        System.out.println("PRODUCTS");
        System.out.println("-----------------------------------------------");

        Product product1 = new FixedPriceProduct();
        product1.setDescription("Vino Gato Negro");
        product1.setId(1010);
        product1.setPrice(46000.0);
        product1.setTax(0.19f);

        Product product2 = new FixedPriceProduct();
        product2.setDescription("Pan Bimbo Artesanal");
        product2.setId(2020);
        product2.setPrice(1560.0);
        product2.setTax(0.19f);

        VariablePriceProduct product3 = new VariablePriceProduct();
        product3.setDescription("Queso Holandes");
        product3.setId(3030);
        product3.setMeasurement("Kilo");
        product3.setPrice(32000.0);
        product3.setQuantity(0.536f);
        product3.setTax(0.19f);

        VariablePriceProduct product4 = new VariablePriceProduct();
        product4.setDescription("Cabano");
        product4.setId(4040);
        product4.setMeasurement("Kilo");
        product4.setPrice(18000.0);
        product4.setQuantity(0.389f);
        product4.setTax(0.19f);

        ComposedProduct product5 = new ComposedProduct();
        product5.setDescription("Ancheta #1");
        product5.setDiscount(0.12f);
        product5.setId(5050);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        ((ComposedProduct) product5).setProducts(products);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        Invoice invoice = new Invoice();
        invoice.addProduct(product1);
        invoice.addProduct(product3);
        invoice.addProduct(product5);

        System.out.println(invoice);
    }
    
}
