package com.factory.product;

@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
public class ProductImplA implements Product {
    @Override
    public void sale() {
        System.out.println("生产productA");
    }

}
