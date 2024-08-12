/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba01poo;

/**
 *
 * @author FelixDDP
 */
public abstract class Product {
    private String description;
    private int id;
    double price;
    private float tax;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public double valueToPay(){
        double p=price+(price*tax);
        return p;
    };

    @Override
    public String toString() {
        return String.format("  %d %s%n       Price......: $%,.2f%n       Tax........: %.2f%%       Value......: $%,.2f",
                             id, description, price, tax * 100, valueToPay());
    }
}

