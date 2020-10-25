package com.company.Feladatok.ShoppingCart;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal prise;
    private int quantity;

    public Product(String name, BigDecimal prise, int quantity) {
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrise() {
        return prise;
    }

    public void setPrise(BigDecimal prise) {
        this.prise = prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
