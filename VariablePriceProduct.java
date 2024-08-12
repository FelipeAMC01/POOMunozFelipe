/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba01poo;

/**
 *
 * @author FelixDDP
 */
public class VariablePriceProduct extends Product{
    private String measurement;
    private float quantity;

    // Getters and setters
    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public double valueToPay() {
        double p=(getPrice()+(getPrice()*getTax()))*quantity;
        return p; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return String.format("  %d %s%n       Measurement: %s%n       Quantity...: %.2f%n       Price......: $%,.2f%n       Tax........: %.2f%%n       Value......: $%,.2f",
                             getId(), getDescription(), measurement, getQuantity(), getPrice(), getTax() * 100, valueToPay());
    }
}

