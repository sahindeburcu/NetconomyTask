package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Product pt = new Product("red", 20);
        Product pt2 = new Product("yellow", 25);
        Product pt3 = new Product("pink", 30);

        Set<Product> products = new HashSet<>();

        products.add(pt);
        products.add(pt2);
        products.add(pt3);

        Set<Product> filteredProducts = products
                .stream()
                .filter(product -> product.getPrice() > 20 && product.getColor() == "yellow")
                .collect(Collectors.toSet());

        filteredProducts.forEach(System.out::println);
    }
}
