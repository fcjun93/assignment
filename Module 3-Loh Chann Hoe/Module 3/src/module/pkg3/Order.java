/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module.pkg3;

import java.math.BigDecimal;

/**
 *
 * @author User
 */
public class Order {

    private static int nextNumber = 1;
    private String item;
    private int number;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal quantityPrice;

 

    public Order(String item, BigDecimal unitPrice, int quantity, BigDecimal quantityPrice) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.quantityPrice = quantityPrice;
        this.number = nextNumber++;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        Order.nextNumber = nextNumber;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityPrice() {
        return quantityPrice;
    }

    public void setQuantityPrice(BigDecimal quantityPrice) {
        this.quantityPrice = quantityPrice;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("No. %-10d %-20s %12s %10s %15s", number, item,
                unitPrice, quantity, quantityPrice);
    }

}
