package com.company.Feladatok.ShoppingCart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    ArrayList<Product> shoppingBasket = new ArrayList<>();

    public void add(Product product) {
        if(shoppingBasket.contains(product)){
            int index = shoppingBasket.indexOf(product);
            int quantity = shoppingBasket.get(index).getQuantity();
            shoppingBasket.get(index).setQuantity(quantity+1);
        } else
        shoppingBasket.add(product);
    }

    public List<String> getProductList() {
        List<String> list = new ArrayList<>();
        for (Product products : shoppingBasket) {
            list.add(products.getName());
        }
        return list;
    }

    public int getSumPrice() {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Product products : shoppingBasket) {
            BigDecimal price = products.getPrise();
            BigDecimal subTotal = price.multiply(BigDecimal.valueOf(products.getQuantity()));
            sum = sum.add(subTotal);
        }
        return sum.intValue();
    }

}
