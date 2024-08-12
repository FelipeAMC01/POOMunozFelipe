/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba01poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FelixDDP
 */
public class Invoice {
    private List<Product> _products;

    // Constructor
    public Invoice() {
        this._products = new ArrayList<>();
    }

    // Método para agregar un producto a la factura
    public void addProduct(Product product) {
        _products.add(product);
    }

    // Método para calcular el valor total a pagar en la factura
    public double valueToPay() {
        double totalValue = 0;
        for (Product product : _products) {
            totalValue += product.valueToPay();
        }
        return totalValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RECEIPT\n");
        sb.append("-------------------------------------------------\n");
        for (Product product : _products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append(String.format("                   =============%nTOTAL: $%,.2f", valueToPay()));
        return sb.toString();
    }
}
