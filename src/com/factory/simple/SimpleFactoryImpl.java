package com.factory.simple;

import com.factory.product.Product;
import com.factory.product.ProductImplA;
import com.factory.product.ProductImplB;

public class SimpleFactoryImpl implements SimpleFactory {
    @Override
    public Product buildProduct(String name) {
        if (name.equals("A")||name=="A"){
                return new ProductImplA();
        }
        else {
            if (name.equals("B") || name == "B") {
                return new ProductImplB();
            }
            else {
                return null;
            }
        }
    }
}
