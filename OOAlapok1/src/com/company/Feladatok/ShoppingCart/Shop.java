package com.company.Feladatok.ShoppingCart;

import java.math.BigDecimal;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        Product fender = new Product("Fender Stratocaster - gitár", new BigDecimal(125_000), 1);
        Product ibanez = new Product("Ibanez Blue Burst - gitár", new BigDecimal(251_000), 1);
        Product hohner = new Product("Hohner Pro - szájharmónika", new BigDecimal(12_000), 3);
        basket.add(fender);
        basket.add(ibanez);
        basket.add(hohner);
        basket.add(fender);
        List<String> productList = basket.getProductList();
        for (String prodDescr : productList) {
            System.out.println(prodDescr + " ");

        }
        System.out.println("Összesen: " + basket.getSumPrice());
    }

}
