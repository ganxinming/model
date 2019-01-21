package com.factory.simple;

import com.factory.product.Product;

public interface SimpleFactory {
    Product buildProduct(String name);
}
