package com.virtusa.wrapper;

import java.util.List;

import com.virtusa.model.Product;

public class ListWrapper{
    List<Product> product;

    public List<Product> getProductList() {
        return product;
    }

    public void setTempEntSetChargesList(List<Product> product) {
        this.product = product;
    }
}