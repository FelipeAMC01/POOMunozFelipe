/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba01poo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author FelixDDP
 */
public class ComposedProduct extends Product {
    private float discount;
    private List<Product> products;

    // Constructor
    public ComposedProduct() {
        this.products = new ArrayList<>();
    }

    // Getters and setters
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public double valueToPay() {
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.valueToPay();
        }
        return totalValue * (1 - discount);
    }

    @Override
    public String toString() {
        String productsList = products.stream()
            .map(Product::getDescription)
            .collect(Collectors.joining(", "));

        return String.format("  %d %s%n       Products...: %s%n       Discount...: %.2f%%%n       Value......: $%,.2f",
                             getId(), getDescription(), productsList, discount * 100, valueToPay());
    }
}
